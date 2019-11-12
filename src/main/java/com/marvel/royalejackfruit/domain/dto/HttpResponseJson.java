package com.marvel.royalejackfruit.domain.dto;

import lombok.Data;

/**
 * Created by Marvel on 2019/11/12.
 */
@Data
public class HttpResponseJson {
    private int statusCode;
    private String responseJson;
}
