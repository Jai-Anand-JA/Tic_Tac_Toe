package com.example.tictactoe.controller;

import org.springframework.web.bind.annotation.*;
import com.example.tictactoe.model.GameService;

@RestController
public class GameController {
    private final GameService game;

    public GameController(GameService game) {
        this.game = game;
    }

    @PostMapping("/move")
    public String makeMove(@RequestParam int position) {
        return game.makeMove(position);
    }

    @GetMapping("/reset")
    public String resetGame() {
        return game.resetGame();
    }
}
