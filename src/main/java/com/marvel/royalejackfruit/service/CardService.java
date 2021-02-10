package com.marvel.royalejackfruit.service;

import com.marvel.royalejackfruit.entity.Card;

import java.util.List;

/**
 * @author Marvel Cheng
 */
public interface CardService {

    void create(Card card);

    List<Card> findAll();

    void sync();
}
