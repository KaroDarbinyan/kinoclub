package am.kinoclub.api.controller;

import am.kinoclub.common.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/rest/user")
    public User getUser(){
        return new User(1, "Poxos");
    }
}
