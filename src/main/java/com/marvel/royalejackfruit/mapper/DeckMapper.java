package com.marvel.royalejackfruit.mapper;

import com.marvel.royalejackfruit.entity.Deck;
import com.marvel.royalejackfruit.entity.UserDeck;

import java.util.List;

/**
 * @author Marvel Cheng
 */
public interface DeckMapper {

    void create(Deck deck);

    void update(Deck deck);

    void delete(Long id);

    List<Deck> findAll();
}
