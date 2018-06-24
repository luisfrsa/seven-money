package com.luis.sevenmoney.service;


import com.luis.sevenmoney.domain.Location;
import com.luis.sevenmoney.domain.User;
import com.luis.sevenmoney.repository.child.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    private static final String ENTITY_NAME = "location";

    @Autowired
    LocationRepository locationRepository;

    public void setLocations(List<Location> locations) {
        locationRepository.set(locations);
    }

    public List<Location> getAll() {
        return locationRepository.getAll();
    }
}