package lesson.stream;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Builder
public class Book {

    private String name;
    private List<Author> authors;
    private Integer price;
}
