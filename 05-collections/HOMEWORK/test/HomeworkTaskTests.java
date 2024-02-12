import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class HomeworkTaskTests {

  @Test
  @DisplayName("should aggregate data by alphabet")
  public void testSolution() {
    Map<String, List<String>> actual = HomeworkTask.aggregateByLetter(Data.DATA);
    actual.forEach((k, v) -> {
      System.out.println(k + " -> " + v);
      Assertions.assertTrue(v.stream().allMatch(s -> s.startsWith(k)));
    });
  }

}
