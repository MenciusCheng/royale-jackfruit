package com.marvel.royalejackfruit.mapper;

import com.marvel.royalejackfruit.entity.Card;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Marvel Cheng
 */
@Repository
public interface CardMapper {

    void create(Card card);

    List<Card> findAll();
}
