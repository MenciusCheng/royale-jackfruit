package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

import java.util.List;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class Player {
    private PlayerClan clan;
    private String role;
    private Integer wins;
    private Integer losses;
    private Integer totalDonations;
    private PlayerLeagueStatistics leagueStatistics;
    private List<PlayerItemLevel> cards;
    private Item currentFavouriteCard;
    private List<PlayerAchievementBadge> badges;
    private Arena arena;
    private String tag;
    private String name;
    private Integer expLevel;
    private Integer trophies;
    private Integer bestTrophies;
    private Integer donations;
    private Integer donationsReceived;
    private List<PlayerAchievementProgress> achievements;
    private Integer battleCount;
    private Integer threeCrownWins;
    private Integer challengeCardsWon;
    private Integer challengeMaxWins;
    private Integer tournamentCardsWon;
    private Integer tournamentBattleCount;
    private List<PlayerItemLevel> currentDeck;
    private Integer warDayWins;
    private Integer clanCardsCollected;
    private Integer starPoints;
}
