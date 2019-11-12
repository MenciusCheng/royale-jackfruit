package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class ClanWarParticipant {
    private String tag;
    private String name;
    private Integer cardsEarned;
    private Integer battlesPlayed;
    private Integer wins;
    private Integer collectionDayBattlesPlayed;
    private Integer numberOfBattles;
}
