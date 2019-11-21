package com.marvel.royalejackfruit.controller;

import com.marvel.royalejackfruit.domain.vo.tournament.TournamentVo;
import com.marvel.royalejackfruit.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

/**
 * Created by Marvel on 2019/11/21.
 */
@Controller
@RequestMapping("/h")
public class HomeViewController {

    private final TournamentService tournamentService;

    @Autowired
    public HomeViewController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @GetMapping("/tournament")
    public String getRecommendTournaments(ModelMap modelMap,
                                          @RequestParam(required = false, defaultValue = "30") Integer capacity,
                                          @RequestParam(required = false, defaultValue = "a") String name) {

        Set<TournamentVo> tournaments = tournamentService.getRecommendTournaments(capacity, name);
        modelMap.addAttribute("tournaments", tournaments);
        return "tournament";
    }
}
