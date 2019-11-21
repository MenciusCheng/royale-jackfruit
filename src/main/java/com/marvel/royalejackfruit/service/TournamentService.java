package com.marvel.royalejackfruit.service;

import com.marvel.royalejackfruit.domain.vo.tournament.TournamentVo;

import java.util.Set;

/**
 * 锦标赛服务
 *
 * Created by Marvel on 2019/11/21.
 */
public interface TournamentService {

    /**
     * 获取推荐的免费锦标赛
     * @param capacity 当前人数
     * @param name 名称
     */
    Set<TournamentVo> getRecommendTournaments(Integer capacity, String name);
}
