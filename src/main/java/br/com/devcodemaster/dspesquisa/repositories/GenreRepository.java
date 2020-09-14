package br.com.devcodemaster.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devcodemaster.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
