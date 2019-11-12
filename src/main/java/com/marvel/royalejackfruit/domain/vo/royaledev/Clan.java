package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

import java.util.List;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class Clan {
    private List<ClanMember> memberList;
    private String tag;
    private String clanChestStatus;
    private Integer clanChestLevel;
    private Integer clanChestMaxLevel;
    private Integer clanScore;
    private Integer clanWarTrophies;
    private Integer requiredTrophies;
    private Integer donationsPerWeek;
    private Integer badgeId;
    private String name;
    private Location location;
    private String type;
    private Integer members;
    private String description;
    private Integer clanChestPoints;
}
