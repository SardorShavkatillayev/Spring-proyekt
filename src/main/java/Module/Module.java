package Module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Module {
    private UUID id;
    private UUID courseId;
    private String ModuleTitle;
    private Integer lessonsCount;
    private LocalDate startDate;
    private LocalDate endDate;
}
