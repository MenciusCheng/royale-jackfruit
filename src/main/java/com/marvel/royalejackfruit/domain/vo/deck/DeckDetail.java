package com.marvel.royalejackfruit.domain.vo.deck;

import com.marvel.royalejackfruit.entity.Card;
import lombok.Data;

import java.util.List;

/**
 * @author Marvel Cheng
 */
@Data
public class DeckDetail {
    private Long id;

    private String name;

    private String code;

    private String remark;

    private List<Card> cards;
}
