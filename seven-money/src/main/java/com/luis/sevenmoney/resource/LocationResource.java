package com.luis.sevenmoney.resource;


import com.luis.sevenmoney.domain.Location;
import com.luis.sevenmoney.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LocationResource {
    private static final String ENTITY_NAME = "user";

    @Autowired
    private LocationService locationService;


    @PostMapping("/locations")
    public ResponseEntity insertList(@RequestBody List<Location> locations) {
        locationService.setLocations(locations);
        return ResponseEntity.ok().body(locationService.getAll());
    }


}