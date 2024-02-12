import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class HomeworkTask {

    public static Set<String> letters = Set.of(
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
    );

    public static List<String> getNotNull(List<String> data) {
        return data
                .stream()
                .filter(Objects::nonNull)
                .toList();
    }

    public static Map<String, List<String>> aggregateByLetter(List<String> data) {
        List<String> notNull = getNotNull(data);
        return letters.stream().collect(
                Collectors.toMap(
                        String::toUpperCase,
                        letter -> notNull.stream()
                                .filter(name -> name.startsWith(letter.toUpperCase()))
                                .toList()
                )
        );
    }

}
