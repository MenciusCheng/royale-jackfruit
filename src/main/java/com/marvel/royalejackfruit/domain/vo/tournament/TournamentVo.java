package com.marvel.royalejackfruit.domain.vo.tournament;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class TournamentVo {
    private String remainingTime;
    private String gameMode;
    private String tag;
    private String name;
    private Integer capacity;
    private Integer maxCapacity;
}
