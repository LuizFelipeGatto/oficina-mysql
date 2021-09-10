package com.example.demo.controller;

import com.example.demo.model.Fazenda;
import com.example.demo.repository.FazendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fazenda")
public class FazendaController {

    private final FazendaRepository fazendaRepository;

    @Autowired
    public FazendaController(FazendaRepository fazendaRepository) {
        this.fazendaRepository = fazendaRepository;
    }

    @PostMapping
    public ResponseEntity<Fazenda> saveFazenda(@RequestBody Fazenda fazenda) {
        return ResponseEntity.ok(fazendaRepository.save(fazenda));
    }

    @GetMapping
    public ResponseEntity<List<Fazenda>> getFazendas(){
        return ResponseEntity.ok(fazendaRepository.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apaga(@PathVariable("id") Integer id) {
        fazendaRepository.deleteById(id);
        return ResponseEntity.ok("ok");
    }
}
