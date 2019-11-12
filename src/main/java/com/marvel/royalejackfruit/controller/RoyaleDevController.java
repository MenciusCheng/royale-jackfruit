package com.marvel.royalejackfruit.controller;

import com.marvel.royalejackfruit.domain.vo.royaledev.*;
import com.marvel.royalejackfruit.service.RoyaleDevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/players/{tag}")
    public Player getPlayer(@PathVariable String tag) {
        return royaleDevService.getPlayer(tag);
    }

    @GetMapping("/players/{tag}/upcomingchests")
    public ChestList getPlayerUpcomingChests(@PathVariable String tag) {
        return royaleDevService.getPlayerUpcomingChests(tag);
    }

    @GetMapping("/players/{tag}/battlelog")
    public List<Battle> getPlayerBattleLog(@PathVariable String tag) {
        return royaleDevService.getPlayerBattleLog(tag);
    }

    @GetMapping("/clans/{tag}")
    public Clan getClan(@PathVariable String tag) {
        return royaleDevService.getClan(tag);
    }

    @GetMapping("/clans/{tag}/members")
    public ClanMemberList getClanMembers(@PathVariable String tag) {
        return royaleDevService.getClanMembers(tag);
    }

    @GetMapping("/clans/{tag}/warlog")
    public ClanWarLog getClanWarLog(@PathVariable String tag) {
        return royaleDevService.getClanWarLog(tag);
    }

    @GetMapping("/clans/{tag}/currentwar")
    public CurrentClanWar getClanCurrentWar(@PathVariable String tag) {
        return royaleDevService.getClanCurrentWar(tag);
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
