package Group;

import Transaction.EducationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Group {
    private UUID id;
    private UUID mentorId;
    private UUID courseId;
    private GroupType groupType;
    private GroupStatus status;
    private String groupName;
    private String surname;
    private LocalDate startDate;
    private String phoneNumber;
    private EducationType educationType;
    private List<UUID> modules;
}
