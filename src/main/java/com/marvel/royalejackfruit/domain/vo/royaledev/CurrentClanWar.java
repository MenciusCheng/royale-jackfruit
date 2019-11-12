package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

import java.util.List;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class CurrentClanWar {
    private String state;
    private ClanWarClan clan;
    private List<ClanWarParticipant> participants;
    private List<ClanWarClan> clans;
    private String collectionEndTime;
    private String warEndTime;
}
