package com.luis.sevenmoney.resource;


import com.luis.sevenmoney.domain.TimePunche;
import com.luis.sevenmoney.service.TimePunchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TimePuncheResource {
    private static final String ENTITY_NAME = "timePunche";

    @Autowired
    private TimePunchesService timePuncheService;


    @PostMapping("/timePunches")
    public ResponseEntity insertList(@RequestBody List<TimePunche> timePunches) {
        timePuncheService.setTimePunches(timePunches);
        return ResponseEntity.ok().body(timePuncheService.getAll());
    }


}