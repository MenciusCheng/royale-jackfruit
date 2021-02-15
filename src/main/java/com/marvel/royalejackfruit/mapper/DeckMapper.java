package com.marvel.royalejackfruit.mapper;

import com.marvel.royalejackfruit.entity.Deck;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Marvel Cheng
 */
public interface DeckMapper {

    void create(Deck deck);

    void update(Deck deck);

    void delete(Long id);

    List<Deck> findAll();

    List<Deck> findByParam(@Param("codeLike") String codeLike, @Param("start") Integer start, @Param("limit") Integer limit);

    int countByParam(@Param("codeLike") String codeLike);
}
