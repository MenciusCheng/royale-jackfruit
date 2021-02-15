package com.marvel.royalejackfruit.service;

import com.marvel.royalejackfruit.domain.vo.deck.DeckDetail;
import com.marvel.royalejackfruit.entity.Deck;
import com.marvel.royalejackfruit.entity.UserDeck;

import java.util.List;

/**
 * @author Marvel Cheng
 */
public interface DeckService {

    void create(Deck deck);

    void update(Deck deck);

    void delete(Long id);

    List<DeckDetail> findAll();

    List<DeckDetail> findByParam(String codeItem, Integer start);

    Integer countByParam(String codeItem);
}
