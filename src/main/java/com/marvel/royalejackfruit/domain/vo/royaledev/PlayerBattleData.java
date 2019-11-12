package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

import java.util.List;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class PlayerBattleData {
    private PlayerClan clan;
    private List<PlayerItemLevel> cards;
    private String tag;
    private String name;
    private Integer startingTrophies;
    private Integer trophyChange;
    private Integer crowns;
    private Integer kingTowerHitPoints;
    private List<Integer> princessTowersHitPoints;
}
