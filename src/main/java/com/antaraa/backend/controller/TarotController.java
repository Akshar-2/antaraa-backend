package com.antaraa.backend.controller;

import com.antaraa.backend.model.TarotCard;
import com.antaraa.backend.repository.TarotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TarotController {

    @Autowired
    private TarotRepository repo;

    @GetMapping("/cards")
    public List<TarotCard> getAll() {
        return repo.findAll();
    }

    @GetMapping("/daily")
    public TarotCard getDaily() {
        List<TarotCard> cards = repo.findAll();
        Collections.shuffle(cards);
        return cards.get(0);
    }

    @GetMapping("/draw/{count}")
    public List<TarotCard> draw(@PathVariable int count) {
        List<TarotCard> cards = repo.findAll();
        Collections.shuffle(cards);
        return cards.stream().limit(count).toList();
    }
}