package com.example.demo.controller;

import com.example.demo.job.JobService;
import com.example.demo.model.DryersLog;
import com.example.demo.repository.DryersLogRepository;
import com.example.demo.service.DryersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensores")
@RequiredArgsConstructor
public class DashboardController {

    private final DryersLogRepository dryersLogRepository;

    @GetMapping
    public ResponseEntity<DryersLog> getSensores(){
        return ResponseEntity.ok(dryersLogRepository.findFirstBy());
    }
}
