package com.matheuspierro.shipmonitoring.service;

import io.micrometer.core.instrument.MeterRegistry;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonitoringService {

    @Autowired
    private MeterRegistry meterRegistry;

    @PostConstruct
    public void init() {
        meterRegistry.gauge("custom_metric", 42);
    }
}
