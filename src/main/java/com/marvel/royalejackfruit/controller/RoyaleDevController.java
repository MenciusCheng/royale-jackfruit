package com.marvel.royalejackfruit.controller;

import com.marvel.royalejackfruit.domain.vo.royaledev.ItemList;
import com.marvel.royalejackfruit.domain.vo.royaledev.TournamentHeaderList;
import com.marvel.royalejackfruit.service.RoyaleDevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marvel on 2019/11/12.
 */
@RestController
@RequestMapping("/api/v1/royaledev")
public class RoyaleDevController {

    private final RoyaleDevService royaleDevService;

    @Autowired
    public RoyaleDevController(RoyaleDevService royaleDevService) {
        this.royaleDevService = royaleDevService;
    }

    @GetMapping("/tournaments")
    public TournamentHeaderList searchTournaments(@RequestParam String name) {
        return royaleDevService.searchTournaments(name);
    }

    @GetMapping("/cards")
    public ItemList getCards() {
        return royaleDevService.getCards();
    }
}
