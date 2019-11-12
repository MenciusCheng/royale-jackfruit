package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class PlayerAchievementProgress {
    private Integer stars;
    private Integer value;
    private String name;
    private Integer target;
    private String info;
    private String completionInfo;
}
