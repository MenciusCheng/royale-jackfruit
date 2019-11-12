package com.marvel.royalejackfruit.service.impl;

import com.google.gson.Gson;
import com.marvel.royalejackfruit.constant.RoyaleDevURL;
import com.marvel.royalejackfruit.domain.dto.HttpResponseJson;
import com.marvel.royalejackfruit.domain.vo.royaledev.ItemList;
import com.marvel.royalejackfruit.domain.vo.royaledev.TournamentHeaderList;
import com.marvel.royalejackfruit.helper.HttpHelper;
import com.marvel.royalejackfruit.service.RoyaleDevService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Marvel on 2019/11/12.
 */
@Service
public class RoyaleDevServiceImpl implements RoyaleDevService {

    private static final Logger logger = LoggerFactory.getLogger(RoyaleDevServiceImpl.class);
    private final Gson gson = new Gson();

    @Value("${royale.token}")
    private String royaleToken;

    @Override
    public TournamentHeaderList searchTournaments(String name) {
        String url = RoyaleDevURL.TOURNAMENTS + "?name=" + name;
        HttpResponseJson httpResponseJson = HttpHelper.get(url, royaleToken);
        return gson.fromJson(httpResponseJson.getResponseJson(), TournamentHeaderList.class);
    }

    @Override
    public ItemList getCards() {
        String url = RoyaleDevURL.CARDS;
        HttpResponseJson httpResponseJson = HttpHelper.get(url, royaleToken);
        return gson.fromJson(httpResponseJson.getResponseJson(), ItemList.class);
    }
}
