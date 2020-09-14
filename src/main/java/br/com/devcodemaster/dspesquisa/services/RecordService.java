package br.com.devcodemaster.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devcodemaster.dspesquisa.dto.RecordDTO;
import br.com.devcodemaster.dspesquisa.dto.RecordInsertDTO;
import br.com.devcodemaster.dspesquisa.entities.Game;
import br.com.devcodemaster.dspesquisa.entities.Record;
import br.com.devcodemaster.dspesquisa.repositories.GameRepository;
import br.com.devcodemaster.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
    @Autowired
    private RecordRepository recordRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto) {
        Record entity = new Record();
        Game game = gameRepository.getOne(dto.getGameId());

        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setMoment(Instant.now());
        entity.setGame(game);

        entity = recordRepository.save(entity);
        return new RecordDTO(entity);
    }
}
