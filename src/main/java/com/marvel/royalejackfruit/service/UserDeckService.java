package com.marvel.royalejackfruit.service;

import com.marvel.royalejackfruit.entity.UserDeck;

import java.util.List;

/**
 * @author Marvel Cheng
 */
public interface UserDeckService {

    void create(UserDeck userDeck);

    void update(UserDeck userDeck);

    void delete(Long id);

    List<UserDeck> findAllByUserId(String userId);
}
