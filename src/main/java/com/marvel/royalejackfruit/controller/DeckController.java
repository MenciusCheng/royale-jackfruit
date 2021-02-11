package com.marvel.royalejackfruit.controller;

import com.marvel.royalejackfruit.domain.vo.deck.DeckDetail;
import com.marvel.royalejackfruit.entity.Card;
import com.marvel.royalejackfruit.entity.Deck;
import com.marvel.royalejackfruit.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Marvel Cheng
 */
@Controller
@RequestMapping("/deck")
public class DeckController {

    private final DeckService deckService;

    @Autowired
    public DeckController(DeckService deckService) {
        this.deckService = deckService;
    }

    @GetMapping("/page")
    public String getAllDeckPage(ModelMap modelMap) {
        List<DeckDetail> deckDetails = deckService.findAll();
        modelMap.addAttribute("decks", deckDetails);
        modelMap.addAttribute("page", "deck");
        return "deck/deck";
    }

    @GetMapping("/create")
    public String create(ModelMap modelMap,
                         @RequestParam String name,
                         @RequestParam String code,
                         @RequestParam(required = false, defaultValue = "") String remark) {
        Deck deck = new Deck();
        deck.setName(name);
        deck.setCode(code);
        deck.setRemark(remark);
        deckService.create(deck);

        List<DeckDetail> deckDetails = deckService.findAll();
        modelMap.addAttribute("decks", deckDetails);
        modelMap.addAttribute("page", "deck");
        return "deck/deck";
    }

    @GetMapping("/delete")
    public String delete(ModelMap modelMap, @RequestParam Long id) {
        deckService.delete(id);

        List<DeckDetail> deckDetails = deckService.findAll();
        modelMap.addAttribute("decks", deckDetails);
        modelMap.addAttribute("page", "deck");
        return "deck/deck";
    }
}
