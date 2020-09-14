package br.com.devcodemaster.dspesquisa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devcodemaster.dspesquisa.dto.RecordDTO;
import br.com.devcodemaster.dspesquisa.dto.RecordInsertDTO;
import br.com.devcodemaster.dspesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordsController {
    @Autowired
    private RecordService recordService;

    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto) {
        RecordDTO newDto = recordService.insert(dto);
        return ResponseEntity.ok().body(newDto);
    }
}
