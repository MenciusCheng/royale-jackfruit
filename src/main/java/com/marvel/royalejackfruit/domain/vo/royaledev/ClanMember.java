package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class ClanMember {
    private Arena arena;
    private Integer clanChestPoints;
    private String lastSeen;
    private String tag;
    private String name;
    private String role;
    private Integer expLevel;
    private Integer trophies;
    private Integer clanRank;
    private Integer previousClanRank;
    private Integer donations;
    private Integer donationsReceived;
}
