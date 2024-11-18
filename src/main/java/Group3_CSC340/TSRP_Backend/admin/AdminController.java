package Group3_CSC340.TSRP_Backend.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class AdminController {

    @Autowired
    private AdminService service;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getOneUser(@PathVariable int userId) {
        return service.getUserById(userId);
    }

    @PostMapping("/new")
    public List<User> addNewUser(@RequestBody User user) {
        service.addNewUser(user);
        return service.getAllUsers();
    }

    @PutMapping("/update/{userId}")
    public User updateUser(@PathVariable int userId, @RequestBody User user) {
        service.updateUser(userId, user);
        return service.getUserById(userId);
    }

    @DeleteMapping("/delete/{userId}")
    public List<User> deleteUserById(@PathVariable int userId) {
        service.deleteUserById(userId);
        return service.getAllUsers();
    }
}