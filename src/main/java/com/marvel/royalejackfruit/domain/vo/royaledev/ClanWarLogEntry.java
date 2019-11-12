package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

import java.util.List;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class ClanWarLogEntry {
    private Integer seasonId;
    private String createdDate;
    private List<ClanWarStanding> standings;
    private List<ClanWarParticipant> participants;
}
