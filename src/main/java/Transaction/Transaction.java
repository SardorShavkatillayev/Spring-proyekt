package Transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {
    private UUID UserId;
    private UUID moduleId;
    private EducationType type;

}
