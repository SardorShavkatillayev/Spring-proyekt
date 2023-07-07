package Course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
   private UUID id ;
   private String courseName;
   private String surname;
   private LocalDate startDate;
   private LocalDate endDate;
}
