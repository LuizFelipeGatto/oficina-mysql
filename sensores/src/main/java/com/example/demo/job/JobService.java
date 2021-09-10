package com.example.demo.job;

import com.example.demo.service.DryersService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@RequiredArgsConstructor
public class JobService {
    private final DryersService dryersService;

    @Scheduled(cron = "0 0/1 * * * *")
    public void getValorSensor(){
        dryersService.buscarDados();
    }
}
