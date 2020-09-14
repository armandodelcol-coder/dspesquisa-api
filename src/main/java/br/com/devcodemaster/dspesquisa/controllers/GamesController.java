package br.com.devcodemaster.dspesquisa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devcodemaster.dspesquisa.dto.GameDTO;
import br.com.devcodemaster.dspesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GamesController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll() {
        List<GameDTO> listGames = gameService.findAll();
        return ResponseEntity.ok().body(listGames);
    }
}
