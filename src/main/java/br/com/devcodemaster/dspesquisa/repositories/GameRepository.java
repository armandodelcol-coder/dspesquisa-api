package br.com.devcodemaster.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devcodemaster.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
