package com.example.demo.service;

import groovy.util.logging.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import org.slf4j.Logger;

@Component
public class SchedulerService {
    private static final String CRON = "*/10 * * * * *";
    private static final Logger logger = LoggerFactory.getLogger(SchedulerService.class);
    @Async
    @Scheduled(cron = CRON)
    public void sendTime() {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        logger.info(String.valueOf(day));
    }
}
