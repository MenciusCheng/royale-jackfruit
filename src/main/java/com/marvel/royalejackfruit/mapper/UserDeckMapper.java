package com.marvel.royalejackfruit.mapper;

import com.marvel.royalejackfruit.entity.UserDeck;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Marvel Cheng
 */
@Repository
public interface UserDeckMapper {

    void create(UserDeck userDeck);

    void update(UserDeck userDeck);

    void delete(Long id);

    List<UserDeck> findAllByUserId(String userId);
}
