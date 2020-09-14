package br.com.devcodemaster.dspesquisa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devcodemaster.dspesquisa.entities.Game;
import br.com.devcodemaster.dspesquisa.repositories.GameRepository;

@RestController
@RequestMapping(value = "/games")
public class GamesController {
    @Autowired
    private GameRepository gameRepository;

    @GetMapping
    public ResponseEntity<List<Game>> findAll() {
        List<Game> listGames = gameRepository.findAll();
        return ResponseEntity.ok().body(listGames);
    }
}
