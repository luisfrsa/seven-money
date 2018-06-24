package com.luis.sevenmoney.resource;


import com.luis.sevenmoney.domain.User;
import com.luis.sevenmoney.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import static java.lang.String.format;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserResource {
    private static final String ENTITY_NAME = "user";

    @Autowired
    private UserService userService;


    @PostMapping("/users")
    public ResponseEntity insertList(@RequestBody List<User> users) {
        userService.setUsers(users);
        return ResponseEntity.ok().body(userService.getAll());
    }


}