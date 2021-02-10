package com.marvel.royalejackfruit.controller;

import com.marvel.royalejackfruit.entity.Card;
import com.marvel.royalejackfruit.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Marvel Cheng
 */
@Controller
@RequestMapping("/card")
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/")
    public String getAllCard(ModelMap modelMap) {
        List<Card> cards = cardService.findAll();
        modelMap.addAttribute("cards", cards);
        return "cards";
    }

    @GetMapping("/sync")
    public String sync(ModelMap modelMap) {
        cardService.sync();
        List<Card> cards = cardService.findAll();
        modelMap.addAttribute("cards", cards);
        return "cards";
    }

}
