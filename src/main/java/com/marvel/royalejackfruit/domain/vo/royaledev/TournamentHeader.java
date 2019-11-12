package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

/**
 * Created by Marvel on 2019/11/11.
 */
@Data
public class TournamentHeader {
    private String status;
    private Integer preparationDuration;
    private String createdTime;
    private Integer firstPlaceCardPrize;
    private GameMode gameMode;
    private Integer duration;
    private String type;
    private String tag;
    private String creatorTag;
    private String name;
    private String description;
    private Integer capacity;
    private Integer maxCapacity;
    private Integer levelCap;
}
