package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class PlayerAchievementBadge {
    private Integer maxLevel;
    private Integer progress;
    private Integer level;
    private Integer target;
    private String name;
}
