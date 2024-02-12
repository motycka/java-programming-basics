import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsTask {

    public static Set<String> letters = Set.of(
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
    );

    public static List<String> getNotNull(List<String> data) {
        return data
                .stream()
//                .filter(name -> name != null) // simpler
                .filter(Objects::nonNull) // more advanced
                .toList();
    }

    public static List<String> getOrdered(List<String> data, boolean reversed) {
        List<String> notNull = getNotNull(data);

        if (reversed) {
            return notNull.stream()
                    .sorted(Comparator.reverseOrder())
                    .toList();
        } else {
            return notNull.stream()
                    .sorted()
                    .toList();
        }
    }

    public static Set<String> getUniqueOrdered(List<String> data, boolean reversed) {
        List<String> notNull = getNotNull(data);
        return new TreeSet<>(getOrdered(notNull, reversed));
    }

    public static Map<String, Integer> aggregate(List<String> data) {
        List<String> notNull = getNotNull(data);

        return notNull.stream().collect(
                Collectors.groupingBy(name -> name, Collectors.summingInt(name -> 1))
        );
    }

    public static Map<String, Integer> aggregateByLetter(List<String> data) {
        List<String> notNull = getNotNull(data);

        return notNull.stream().collect(
                Collectors.groupingBy(name -> name, Collectors.summingInt(name -> 1))
        );
    }



//    public static TreeMap<String, Integer> sortByValue(Map<String, Integer> data) {
//
//        Stream<Map.Entry<String, Integer>> sortedSet = data.entrySet().stream().sorted(
//                Map.Entry.comparingByValue(Comparator.reverseOrder())
//        );
//
//        TreeMap<String, Integer> treeMap = new TreeMap<>();
//
//        sortedSet.forEach(e -> treeMap.put(e.getKey(), e.getValue()));
//
////        TreeMap<String, Integer> treeMap = sortedSet.collect(
////                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> newValue, TreeMap::new)
////        );
//
//        return treeMap;
//
////        TreeMap<String, Integer> treeMapSorted = new TreeMap<>();
////
////        TreeMap<String, Integer> treeMap = map.entrySet().stream().collect(
////                Collectors.toMap(
////                        Map.Entry::getKey,
////                        Map.Entry::getValue,
////                        (oldValue, newValue) -> newValue, TreeMap::new)
////        );
//    }

}
