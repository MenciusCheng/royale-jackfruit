package com.marvel.royalejackfruit.service;

import com.marvel.royalejackfruit.domain.vo.royaledev.*;

import java.util.List;

/**
 * 对接 https://api.clashroyale.com/v1/ 服务
 *
 * Created by Marvel on 2019/11/12.
 */
public interface RoyaleDevService {
    /**
     * 获取玩家信息
     */
    Player getPlayer(String tag);

    /**
     * 获取玩家即将到来的宝箱
     */
    ChestList getPlayerUpcomingChests(String tag);

    /**
     * 获取玩家最近的战斗记录
     */
    List<Battle> getPlayerBattleLog(String tag);

//    /**
//     * 获取部落信息
//     */
//    void getClan(String tag);
//
//    /**
//     * 获取部落成员列表
//     */
//    void getClanMembers(String tag);
//
//    /**
//     * 获取部落最近的部落战记录
//     */
//    void getClanWarLog(String tag);
//
//    /**
//     * 获取部落当前的部落战信息
//     */
//    void getClanCurrentWar(String tag);

    /**
     * 通过名字搜索锦标赛
     */
    TournamentHeaderList searchTournaments(String name);

    /**
     * 获取所有可用的卡
     */
    ItemList getCards();
}
