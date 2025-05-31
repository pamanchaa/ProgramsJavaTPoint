package com.collection;

import java.util.*;

public class CollectionConversionUtils {

    // Convert List to Set
    public static Set<String> listToSet(List<String> list) {
        // Removes duplicates and returns a set
        return new HashSet<>(list);
    }

    // Convert List to Map (Index as key, element as value)
    public static Map<Integer, String> listToMap(List<String> list) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(i, list.get(i));
        }
        return map;
    }

    // Convert Set to List
    public static List<String> setToList(Set<String> set) {
        return new ArrayList<>(set);
    }

    // Convert Set to Map (Index as key, element as value)
    public static Map<Integer, String> setToMap(Set<String> set) {
        Map<Integer, String> map = new HashMap<>();
        int index = 0;
        for (String value : set) {
            map.put(index++, value);
        }
        return map;
    }

    // Convert Map Keys to List
    public static List<String> mapKeysToList(Map<String, String> map) {
        return new ArrayList<>(map.keySet());
    }

    // Convert Map Values to List
    public static List<String> mapValuesToList(Map<String, String> map) {
        return new ArrayList<>(map.values());
    }

    // Convert Map Keys to Set
    public static Set<String> mapKeysToSet(Map<String, String> map) {
        return new HashSet<>(map.keySet());
    }

    // Convert Map Values to Set
    public static Set<String> mapValuesToSet(Map<String, String> map) {
        return new HashSet<>(map.values());
    }

    public static void main(String[] args) {
        // Sample List
        List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Orange");

        // Sample Set
        Set<String> colors = new HashSet<>(Arrays.asList("Red", "Green", "Blue"));

        // Sample Map
        Map<String, String> countryCapital = new HashMap<>();
        countryCapital.put("India", "Delhi");
        countryCapital.put("USA", "Washington");
        countryCapital.put("UK", "London");

        // Demonstrate conversions
        System.out.println("List to Set: " + listToSet(fruits));
        System.out.println("List to Map: " + listToMap(fruits));
        System.out.println("Set to List: " + setToList(colors));
        System.out.println("Set to Map: " + setToMap(colors));
        System.out.println("Map Keys to List: " + mapKeysToList(countryCapital));
        System.out.println("Map Values to List: " + mapValuesToList(countryCapital));
        System.out.println("Map Keys to Set: " + mapKeysToSet(countryCapital));
        System.out.println("Map Values to Set: " + mapValuesToSet(countryCapital));
    }
}

