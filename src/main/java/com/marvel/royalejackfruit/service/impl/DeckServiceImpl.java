package com.marvel.royalejackfruit.service.impl;

import com.marvel.royalejackfruit.domain.vo.deck.DeckDetail;
import com.marvel.royalejackfruit.entity.Card;
import com.marvel.royalejackfruit.entity.Deck;
import com.marvel.royalejackfruit.mapper.DeckMapper;
import com.marvel.royalejackfruit.service.CardService;
import com.marvel.royalejackfruit.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Marvel Cheng
 */
@Service
public class DeckServiceImpl implements DeckService {

    private final DeckMapper deckMapper;

    private final CardService cardService;

    @Autowired
    public DeckServiceImpl(DeckMapper deckMapper, CardService cardService) {
        this.deckMapper = deckMapper;
        this.cardService = cardService;
    }

    @Override
    public void create(Deck deck) {
        deckMapper.create(deck);
    }

    @Override
    public void update(Deck deck) {
        deckMapper.update(deck);
    }

    @Override
    public void delete(Long id) {
        deckMapper.delete(id);
    }

    @Override
    public List<DeckDetail> findAll() {
        List<Deck> decks = deckMapper.findAll();
        return decksToDetail(decks);
    }

    @Override
    public List<DeckDetail> findByParam(String codeItem, Integer start) {
        String codeLike = "%%";
        if (codeItem != null && codeItem.length() > 0) {
            codeLike = "%" + codeItem + "%";
        }
        if (start == null) {
            start = 0;
        }
        Integer size = 10;

        List<Deck> decks = deckMapper.findByParam(codeLike, start, size);
        return decksToDetail(decks);
    }

    @Override
    public Integer countByParam(String codeItem) {
        String codeLike = "%%";
        if (codeItem != null && codeItem.length() > 0) {
            codeLike = "%" + codeItem + "%";
        }
        return deckMapper.countByParam(codeLike);
    }

    private List<DeckDetail> decksToDetail(List<Deck> decks) {
        List<DeckDetail> deckDetails = new ArrayList<>();
        Map<Long, Card> cardMap = cardService.mapById();
        for (Deck deck : decks) {
            List<Card> cards = new ArrayList<>();
            String code = deck.getCode();
            String[] cardCodes = code.split(";");
            for (String cardCode : cardCodes) {
                Long cardCodeLong = Long.valueOf(cardCode);
                Card itemCard = cardMap.get(cardCodeLong);
                cards.add(itemCard);
            }

            DeckDetail deckDetail = new DeckDetail();
            deckDetail.setId(deck.getId());
            deckDetail.setName(deck.getName());
            deckDetail.setCode(deck.getCode());
            deckDetail.setRemark(deck.getRemark());
            deckDetail.setCards(cards);
            deckDetails.add(deckDetail);
        }

        return deckDetails;
    }
}
