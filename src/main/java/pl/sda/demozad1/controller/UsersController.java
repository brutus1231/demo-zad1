package pl.sda.demozad1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.demozad1.model.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User("Marta", "Nowik"));
        users.add(new User("Monika", "Kowalska"));
        return users;
    }
}
