package com.marvel.royalejackfruit.service;

import com.marvel.royalejackfruit.domain.vo.royaledev.ItemList;
import com.marvel.royalejackfruit.domain.vo.royaledev.TournamentHeaderList;

/**
 * 对接 https://api.clashroyale.com/v1/ 服务
 *
 * Created by Marvel on 2019/11/12.
 */
public interface RoyaleDevService {
    /**
     * 通过名字搜索锦标赛
     */
    TournamentHeaderList searchTournaments(String name);

    /**
     * 获取所有可用的卡
     */
    ItemList getCards();
}
