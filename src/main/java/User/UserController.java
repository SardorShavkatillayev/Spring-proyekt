package User;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;


    @GetMapping
    public List<User> getUser() {
        return userService.getAll();
    }

    @PostMapping
    public UUID getUpdate(@RequestBody User user) {
        return userService.userCreate(user);
    }

    @DeleteMapping("/{id}")
    public void deleteByid(@PathVariable("id") UUID id) {
         userService.deleteById(id);


    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable("id") UUID id, @RequestBody User user) {
         userService.updateById(id,user);



    }

}


