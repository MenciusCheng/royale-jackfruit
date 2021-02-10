package com.marvel.royalejackfruit.entity;

import lombok.Data;

/**
 * @author Marvel Cheng
 */
@Data
public class UserDeck {
    private Long id;

    private String name;

    private Long userId;

    private String deckCode;

    private String remark;
}
