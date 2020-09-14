package br.com.devcodemaster.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devcodemaster.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
