package com.luis.sevenmoney.service;


import com.luis.sevenmoney.domain.TimePunche;
import com.luis.sevenmoney.repository.child.TimePuncheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimePunchesService {

    private static final String ENTITY_NAME = "TimePunche";

    @Autowired
    TimePuncheRepository TimePuncheRepository;

    public void setTimePunches(List<TimePunche> TimePunches) {
        TimePuncheRepository.set(TimePunches);
    }

    public List<TimePunche> getAll() {
        return TimePuncheRepository.getAll();
    }
}