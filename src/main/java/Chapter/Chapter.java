package Chapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Chapter {

    private UUID id;
    private UUID lessonId;
    private UUID mentorId;
    private String title;
    private String youtubeLink;



}
