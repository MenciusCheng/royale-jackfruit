package com.marvel.royalejackfruit.domain.vo.royaledev;

import lombok.Data;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class Location {
    private String localizedName;
    private Integer id;
    private String name;
    private Boolean isCountry;
    private String countryCode;
}
