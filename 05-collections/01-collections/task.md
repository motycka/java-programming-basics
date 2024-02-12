# Java Collections

In [CollectionsTask.java](/src/CollectionsTask.java), implement the following:

1. Create a **public static** filed called `temperatures` of type `List<Double>` and initialize it with values:
    ```
    19.2, 20.1, 22.5, 25.4, 28.2, 26.1, 24.0, 21.9, 25.0, 27.2
    ```

2. Create a **public static** field called `dates` of type `List<String>` and initialize it with values:
    ```
    "2024-02-19", "2024-02-20", "2024-02-21", "2024-02-22", "2024-02-23", "2024-02-24", "2024-02-25", "2024-02-26", "2024-02-27", "2024-02-28"
    ```

3. Create a **public static** method `getTemperatures()` that returns the `Map<String, Double>`. 
   The methods should return a map where the key is the date and the value is the temperature.

4. Create a **public static** method `getTemperaturesBetween()`, which takes 3 arguments:
 - `Map<String, Double> temperatures`
 - `Double min`
 - `Double max`
 - The method should return a map with temperatures between `min` and `max` (inclusive).
