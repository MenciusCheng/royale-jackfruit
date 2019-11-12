package com.marvel.royalejackfruit.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.marvel.royalejackfruit.constant.RoyaleDevURL;
import com.marvel.royalejackfruit.domain.dto.HttpResponseJson;
import com.marvel.royalejackfruit.domain.vo.royaledev.*;
import com.marvel.royalejackfruit.helper.HttpHelper;
import com.marvel.royalejackfruit.service.RoyaleDevService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.List;

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
    public Player getPlayer(String tag) {
        String url = RoyaleDevURL.player(tag);
        HttpResponseJson httpResponseJson = HttpHelper.get(url, royaleToken);
        return gson.fromJson(httpResponseJson.getResponseJson(), Player.class);
    }

    @Override
    public ChestList getPlayerUpcomingChests(String tag) {
        String url = RoyaleDevURL.upcomingchests(tag);
        HttpResponseJson httpResponseJson = HttpHelper.get(url, royaleToken);
        return gson.fromJson(httpResponseJson.getResponseJson(), ChestList.class);
    }

    @Override
    public List<Battle> getPlayerBattleLog(String tag) {
        String url = RoyaleDevURL.battlelog(tag);
        HttpResponseJson httpResponseJson = HttpHelper.get(url, royaleToken);
        Type battleListType = new TypeToken<List<Battle>>(){}.getType();
        return gson.fromJson(httpResponseJson.getResponseJson(), battleListType);
    }

    @Override
    public TournamentHeaderList searchTournaments(String name) {
        String url = RoyaleDevURL.tournaments() + "?name=" + name;
        HttpResponseJson httpResponseJson = HttpHelper.get(url, royaleToken);
        return gson.fromJson(httpResponseJson.getResponseJson(), TournamentHeaderList.class);
    }

    @Override
    public ItemList getCards() {
        String url = RoyaleDevURL.cards();
        HttpResponseJson httpResponseJson = HttpHelper.get(url, royaleToken);
        return gson.fromJson(httpResponseJson.getResponseJson(), ItemList.class);
    }
}
