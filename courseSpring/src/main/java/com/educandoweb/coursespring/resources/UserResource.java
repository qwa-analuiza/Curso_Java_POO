package com.educandoweb.coursespring.resources;

import com.educandoweb.coursespring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "Maria@gmai.com", "119875790397", "215646");
        return ResponseEntity.ok().body(u);
    }
}
