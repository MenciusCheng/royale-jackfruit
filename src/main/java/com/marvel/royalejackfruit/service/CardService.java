package com.marvel.royalejackfruit.service;

import com.marvel.royalejackfruit.entity.Card;

import java.util.List;
import java.util.Map;

/**
 * @author Marvel Cheng
 */
public interface CardService {

    void create(Card card);

    List<Card> findAll();

    void sync();

    Map<Long, Card> mapById();
}
