package com.collections;

import java.util.*;

public class CollectionsUtils {

    // 1️⃣ Create and Populate a List
    public static List<String> createList() {
        return new ArrayList<>(Arrays.asList("Java", "Python", "C++", "JavaScript", "Go"));
    }

    // 2️⃣ Sort a List (Ascending)
    public static void sortListAscending(List<String> list) {
        Collections.sort(list);
    }

    // 3️⃣ Sort a List (Descending)
    public static void sortListDescending(List<String> list) {
        list.sort(Collections.reverseOrder());
    }

    // 4️⃣ Reverse a List
    public static void reverseList(List<String> list) {
        Collections.reverse(list);
    }

    // 5️⃣ Shuffle a List
    public static void shuffleList(List<String> list) {
        Collections.shuffle(list);
    }

    // 6️⃣ Find Frequency of an Element in a List
    public static int findFrequency(List<String> list, String key) {
        return Collections.frequency(list, key);
    }

    // 7️⃣ Merge Two Lists
    public static List<String> mergeLists(List<String> list1, List<String> list2) {
        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    // 8️⃣ Convert List to Set (Remove Duplicates)
    public static Set<String> convertListToSet(List<String> list) {
        return new HashSet<>(list);
    }

    // 9️⃣ Create and Populate a Map
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 10);
        map.put("Python", 8);
        map.put("C++", 7);
        return map;
    }

    // 🔟 Iterate Over a Map and Print Key-Value Pairs
    public static void iterateMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // 📌 Main Method to Demonstrate All Operations
    public static void main(String[] args) {
        // List Operations
        List<String> languages = createList();
        System.out.println("Original List: " + languages);

        sortListAscending(languages);
        System.out.println("Sorted List (Ascending): " + languages);

        sortListDescending(languages);
        System.out.println("Sorted List (Descending): " + languages);

        reverseList(languages);
        System.out.println("Reversed List: " + languages);

        shuffleList(languages);
        System.out.println("Shuffled List: " + languages);

        System.out.println("Frequency of 'Java': " + findFrequency(languages, "Java"));

        List<String> moreLanguages = Arrays.asList("Ruby", "Swift", "Kotlin");
        List<String> mergedList = mergeLists(languages, moreLanguages);
        System.out.println("Merged List: " + mergedList);

        Set<String> uniqueLanguages = convertListToSet(mergedList);
        System.out.println("Unique Languages (Converted to Set): " + uniqueLanguages);

        // Map Operations
        Map<String, Integer> languageRatings = createMap();
        System.out.println("\nLanguage Ratings:");
        iterateMap(languageRatings);
    }
}
