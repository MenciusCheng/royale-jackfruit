package com.marvel.royalejackfruit.controller;

import com.marvel.royalejackfruit.domain.vo.tournament.TournamentVo;
import com.marvel.royalejackfruit.service.RoyaleDevService;
import com.marvel.royalejackfruit.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Created by Marvel on 2019/11/12.
 */
@RestController
@RequestMapping("/api/v1/tournament")
public class TournamentController {

    private final TournamentService tournamentService;

    @Autowired
    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @GetMapping("/recommend")
    public Set<TournamentVo> getRecommendTournaments(@RequestParam(required = false, defaultValue = "30") Integer capacity,
                                                     @RequestParam(required = false, defaultValue = "a") String name) {
        return tournamentService.getRecommendTournaments(capacity, name);
    }

}
