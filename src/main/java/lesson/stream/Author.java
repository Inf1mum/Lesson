package lesson.stream;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Author {

    private String firstName;
    private String lastName;
}
