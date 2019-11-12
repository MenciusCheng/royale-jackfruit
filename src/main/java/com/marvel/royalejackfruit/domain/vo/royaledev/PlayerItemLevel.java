package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class PlayerItemLevel {
    private Integer id;
    private Integer count;
    private Integer level;
    private Integer starLevel;
    private String name;
    private Integer maxLevel;
    private IconUrl iconUrls;
}
