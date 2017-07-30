package com.alex.nostromo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public final class GameController {
    @RequestMapping("/game")
    public Game retrieveGame(HttpServletRequest request) {
        final Game game = new Game(1, "Uncharted: Golden Abyss", "PlayStation Vita");
        game.setDeveloper("IE Bend Studio");
        game.setPublisher("Sony Computer Entertainment");
        return game;
    }
}
