package com.luis.sevenmoney.resource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;
import java.util.Optional;

import static java.lang.String.format;

@RestController
@RequestMapping("/api")
public class InitializeResource {

    private final Logger log = LoggerFactory.getLogger(InitializeResource.class);

//    @Autowired
//    private InitializeService initializeService;
//
//    @GetMapping("/pullAll")
//    public ResponseEntity<Boolean> pull() {
//        log.info("Request for initialize data");
//        initializeService.pull();
//        return ResponseEntity.ok().body(Boolean.TRUE);
//    }
}