package com.marvel.royalejackfruit.entity;

import lombok.Data;

/**
 * 卡牌
 *
 * @author Marvel Cheng
 */
@Data
public class Card {

    private Long id;

    private String name;

    private Integer maxLevel;

    private String iconUrls;
}
