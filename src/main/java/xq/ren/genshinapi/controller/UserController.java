package xq.ren.genshinapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xq.ren.genshinapi.model.UserData;
import xq.ren.genshinapi.service.UserService;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public Optional<UserData> getUserById(@PathVariable String username) throws InterruptedException, ExecutionException {
        return userService.getUser(username);
    }

    @GetMapping
    public List<UserData> getAllUsers() throws InterruptedException, ExecutionException {
        return userService.getAllUsers();
    }

}
