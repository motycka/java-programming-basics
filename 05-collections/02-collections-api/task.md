# Working with Java Collections

You are given sample data in class `Data.DATA`

Your task is to implement the following methods in the CollectionsTask class:

### Filter
Filter the collection and return only non-null elements.

**Method signature:**

`public static List<String> getNotNull(List<String> data)`

### Sort
Sort the collection in natural order. If reversed is true, sort the collection in reverse order.

**Method signature:**

`public static List<String> getOrdered(List<String> data, boolean reversed)`

### Unique
Return a set of unique ordered elements from the collection. If reversed is true, return the set in reverse order.

**Method signature:**

`public static Set<String> getUniqueOrdered(List<String> data, boolean reversed)`

### Aggregate
Group elements in the collection by their value and return a map of elements and their count.

**Method signature:**

`public static Map<String, Integer> aggregate(List<String> data)`



