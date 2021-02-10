package com.marvel.royalejackfruit.service.impl;

import com.marvel.royalejackfruit.domain.vo.royaledev.Item;
import com.marvel.royalejackfruit.domain.vo.royaledev.ItemList;
import com.marvel.royalejackfruit.entity.Card;
import com.marvel.royalejackfruit.mapper.CardMapper;
import com.marvel.royalejackfruit.service.CardService;
import com.marvel.royalejackfruit.service.RoyaleDevService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Marvel Cheng
 */
@Service
public class CardServiceImpl implements CardService {

    private final Logger logger = LoggerFactory.getLogger(CardServiceImpl.class);

    private final CardMapper cardMapper;

    private final RoyaleDevService royaleDevService;

    @Autowired
    public CardServiceImpl(CardMapper cardMapper, RoyaleDevService royaleDevService) {
        this.cardMapper = cardMapper;
        this.royaleDevService = royaleDevService;
    }

    @Override
    public void create(Card card) {
        cardMapper.create(card);
    }

    @Override
    public List<Card> findAll() {
        return cardMapper.findAll();
    }

    @Override
    public void sync() {
        ItemList cards = royaleDevService.getCards();

        List<Card> existCards = cardMapper.findAll();
        Map<Long, Card> existCardMap = new HashMap<>();
        for (Card item : existCards) {
            existCardMap.put(item.getId(), item);
        }

        for (Item item : cards.getItems()) {
            Card card = existCardMap.get(Long.valueOf(item.getId()));
            if (card == null) {
                Card insertCart = new Card();
                insertCart.setId(Long.valueOf(item.getId()));
                insertCart.setName(item.getName());
                insertCart.setMaxLevel(item.getMaxLevel());
                insertCart.setIconUrls(item.getIconUrls().getMedium());
                create(insertCart);
                logger.info("创建卡牌：" + insertCart.toString());
            }
        }
    }
}
