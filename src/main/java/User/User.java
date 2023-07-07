package User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class User {

    @Id
    private UUID id;
    private String name;
    private String surname;
    private LocalDateTime dataOfBirth;
    private String phoneNumber;
    private UserRole userRole;

}
