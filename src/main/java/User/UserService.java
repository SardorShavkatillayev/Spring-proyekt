package User;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
   private final UserRepository userRepository;

    List<User> userList = new ArrayList<>();

    {
        userList.add(new User(UUID.randomUUID(), "ruslan", "Ruslan", LocalDateTime.now(),
                "998905244344", UserRole.NEW));
        userList.add(new User(UUID.randomUUID(), "sardor", "sardor", LocalDateTime.now(),
                "998905244344", UserRole.OLD));
        userList.add(new User(UUID.randomUUID(), "sarvar", "sarvar", LocalDateTime.now(),
                "998905244344", UserRole.NEW));
        userList.add(new User(UUID.randomUUID(), "qodir", "qodir", LocalDateTime.now(),
                "998905244344", UserRole.OLD));
        userList.add(new User(UUID.randomUUID(), "g`ulom", "g`ulom", LocalDateTime.now(),
                "998905244344", UserRole.NEW));
    }

    public List<User> getAll( ) {
        return userList;
    }

    public UUID userCreate(User user) {
        UUID id = UUID.randomUUID();
        user.setId(id);
        userList.add(user);
        return id;



    }

    public void deleteById(UUID id) {
        userList.removeIf(user -> user.getId().equals(id));

    }

    public void updateById(UUID id, User user) {
        User user1 = userList.stream().filter(user2 -> user2.getId().equals(id))
                .findFirst().orElseThrow(() -> new RuntimeException("id yoq topilmadi"));

        user1.setUserRole(user.getUserRole());
        user1.setName(user.getName());
        user1.setSurname(user.getSurname());
        user1.setPhoneNumber(user.getPhoneNumber());
        user1.setDataOfBirth(user.getDataOfBirth());

    }
}
