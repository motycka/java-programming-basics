import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class CollectionsTaskTest {

  private static final List<String> data = Data.DATA;
  private static final List<String> notNull = data.stream().filter(Objects::nonNull).sorted().toList();

  @Test
  @DisplayName("should return only not null elements")
  public void testGetNotNull() {
    CollectionsTask.getNotNull(data).forEach(Assertions::assertNotNull);
  }

  @Test
  @DisplayName("should return ordered")
  public void testOrderedList() {
    CollectionsTask.getOrdered(notNull, false).forEach(System.out::println);
  }

  @Test
  @DisplayName("should return ordered reversed")
  public void testOrderedListReversed() {
    CollectionsTask.getOrdered(notNull, true).forEach(System.out::println);
  }

  @Test
  @DisplayName("should return only unique elements, ordered")
  public void testGetUnique1() {
    Assertions.assertEquals(new HashSet<>(notNull), CollectionsTask.getUniqueOrdered(data, false));
  }

  @Test
  @DisplayName("should return only unique elements, ordered reversed")
  public void testGetUnique2() {
    Assertions.assertEquals(new HashSet<>(notNull), CollectionsTask.getUniqueOrdered(data, true));
  }

  @Test
  @DisplayName("should return aggregated by name")
  public void testAggregateByName() {
    Map<String, Integer> expected = notNull.stream().collect(
            Collectors.groupingBy(name -> name, Collectors.summingInt(name -> 1))
    );

    CollectionsTask.aggregate(data).forEach((k, v) -> {
      System.out.println(k + " -> " + v);
    });

    Assertions.assertEquals(expected, CollectionsTask.aggregate(data));
  }

//  @Test
//  @DisplayName("should sort map by value")
//  public void testOrderByValue() {
//    Map<String, Integer> map = CollectionsTask.aggregate(data);
//
//    CollectionsTask.sortByValue(map).forEach((k, v) -> {
//      System.out.println(k + " -> " + v);
//    });
//
//  }

}
