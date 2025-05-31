package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUtils {

    // 1. Add key-value pair to map
    public static void addEntry(Map<String, Integer> map, String key, Integer value) {
        map.put(key, value);
    }

    // 2. Get value by key
    public static Integer getValue(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    // 3. Check if key exists
    public static boolean containsKey(Map<String, Integer> map, String key) {
        return map.containsKey(key);
    }

    // 4. Check if value exists
    public static boolean containsValue(Map<String, Integer> map, Integer value) {
        return map.containsValue(value);
    }

    // 5. Remove entry by key
    public static void removeEntry(Map<String, Integer> map, String key) {
        map.remove(key);
    }

    // 6. Get size of map
    public static int getSize(Map<String, Integer> map) {
        return map.size();
    }

    // 7. Check if map is empty
    public static boolean isEmpty(Map<String, Integer> map) {
        return map.isEmpty();
    }

    // 8. Clear map
    public static void clearMap(Map<String, Integer> map) {
        map.clear();
    }

    // 9. Iterate over keys
    public static void printAllKeys(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }
    }

    // 10. Iterate over values
    public static void printAllValues(Map<String, Integer> map) {
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
    }

    // 11. Iterate over key-value pairs
    public static void printAllEntries(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // 12. Copy map
    public static Map<String, Integer> copyMap(Map<String, Integer> map) {
        return new HashMap<>(map);
    }

    // 13. Merge two maps
    public static void mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            map1.put(entry.getKey(), entry.getValue());
        }
    }

    // 14. Get all keys
    public static Set<String> getKeys(Map<String, Integer> map) {
        return map.keySet();
    }

    // 15. Get all values
    public static java.util.Collection<Integer> getValues(Map<String, Integer> map) {
        return map.values();
    }

    // 16. Replace a value
    public static void replaceValue(Map<String, Integer> map, String key, Integer newValue) {
        if (map.containsKey(key)) {
            map.put(key, newValue);
        }
    }

    // 17. Compute sum of all values
    public static int sumValues(Map<String, Integer> map) {
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        return sum;
    }

    // 18. Find key for a given value (first match)
    public static String getKeyForValue(Map<String, Integer> map, Integer targetValue) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(targetValue)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 19. Increment value for a key
    public static void incrementValue(Map<String, Integer> map, String key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    // 20. Count frequency of characters in a string using map
    public static Map<Character, Integer> charFrequency(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        return freq;
    }

    // 21. Compare two maps
    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
        return map1.equals(map2);
    }

    // 22. Swap values of two keys
    public static void swapValues(Map<String, Integer> map, String key1, String key2) {
        Integer temp = map.get(key1);
        map.put(key1, map.get(key2));
        map.put(key2, temp);
    }

    // 23. Get entries as string
    public static String getMapAsString(Map<String, Integer> map) {
        return map.toString();
    }

    // 24. Remove entry by value
    public static void removeByValue(Map<String, Integer> map, Integer value) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(value));
    }

    // 25. Create map from two arrays (keys and values)
    public static Map<String, Integer> createMapFromArrays(String[] keys, Integer[] values) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < keys.length && i < values.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        addEntry(map, "one", 1);
        addEntry(map, "two", 2);
        addEntry(map, "three", 3);

        System.out.println("Value for key 'two': " + getValue(map, "two"));
        System.out.println("Contains key 'one': " + containsKey(map, "one"));
        System.out.println("Contains value 3: " + containsValue(map, 3));

        printAllEntries(map);

        incrementValue(map, "two");
        System.out.println("After incrementing 'two': " + getValue(map, "two"));

        System.out.println("Sum of values: " + sumValues(map));

        Map<Character, Integer> freq = charFrequency("hello world");
        System.out.println("Char frequency: " + freq);
    }
}

