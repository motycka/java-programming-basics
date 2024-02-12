import java.util.*;

public class CollectionsTask {

    public static List<Double> temperatures = new ArrayList<>(List.of(
            19.2, 20.1, 22.5, 25.4, 28.2,
            26.1, 24.0, 21.9, 25.0, 27.2
    ));

    public static Set<String> dates = new TreeSet<>(Set.of(
            "2024-02-19", "2024-02-20", "2024-02-21", "2024-02-22", "2024-02-23",
            "2024-02-24", "2024-02-25", "2024-02-26", "2024-02-27", "2024-02-28"
    ));

    public static Map<String, Double> getTemperatures() {
        Map<String, Double> map = new HashMap<>();

        int index = 0;
        for (String date : dates) {
            map.put(date, temperatures.get(index));
            index++;
        }

        return map;
    }

    public static Map<String, Double> getTemperaturesBetween(Map<String, Double> temperatures, Double min, Double max) {
        Map<String, Double> map = new HashMap<>();

        for (Map.Entry<String, Double> entry : temperatures.entrySet()) {
            if (entry.getValue() >= min && entry.getValue() <= max) {
                map.put(entry.getKey(), entry.getValue());
            }
        }

        return map;
    }

}
