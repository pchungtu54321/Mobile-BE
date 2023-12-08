package letmecook.BE.controller;

import letmecook.BE.model.User;
import letmecook.BE.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        Optional<User> user = userService.getUser(id);
        return (User) user.orElse(null);
    }

    @GetMapping("/user")
    public List<User> getUser() {
        return userService.getAllUser();
    }

}
