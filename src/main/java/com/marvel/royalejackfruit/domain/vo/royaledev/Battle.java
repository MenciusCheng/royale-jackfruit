package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

import java.util.List;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class Battle {
    private Arena arena;
    private GameMode gameMode;
    private List<PlayerBattleData> opponent;
    private String type;
    private String deckSelection;
    private List<PlayerBattleData> team;
    private Integer challengeWinCountBefore;
    private String battleTime;
    private Integer challengeId;
    private String tournamentTag;
    private String challengeTitle;
    private String replayTag;
    private Boolean isLadderTournament;
}
