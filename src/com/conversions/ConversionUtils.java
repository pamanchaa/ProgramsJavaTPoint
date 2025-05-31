package com.conversions;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ConversionUtils {

    // 1️⃣ Convert String to Char Array
    public static char[] stringToCharArray(String str) {
        return str.toCharArray();
    }

    // 2️⃣ Convert String to String Array (Split by Space)
    public static String[] stringToStringArray(String str) {
        return str.split(" ");
    }

    // 3️⃣ Convert String to List
    public static List<String> stringToList(String str) {
        return Arrays.asList(str.split(" "));
    }

    // 4️⃣ Convert Array to String
    public static String arrayToString(String[] arr) {
        return String.join(" ", arr);
    }

    // 5️⃣ Convert Array to List
    public static List<String> arrayToList(String[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    // 6️⃣ Convert List to String
    public static String listToString(List<String> list) {
        return String.join(" ", list);
    }

    // 7️⃣ Convert List to Array
    public static String[] listToArray(List<String> list) {
        return list.toArray(new String[0]);
    }

    // 📌 Main Method for Testing
    public static void main(String[] args) {
        String example = "Java is powerful";
        
        // String to Char Array
        System.out.println("String to Char Array:");
        System.out.println(Arrays.toString(stringToCharArray(example)));

        // String to String Array
        System.out.println("\nString to String Array:");
        System.out.println(Arrays.toString(stringToStringArray(example)));

        // String to List
        System.out.println("\nString to List:");
        System.out.println(stringToList(example));

        // Array to String
        String[] exampleArray = {"Hello", "World", "Java"};
        System.out.println("\nArray to String:");
        System.out.println(arrayToString(exampleArray));

        // Array to List
        System.out.println("\nArray to List:");
        System.out.println(arrayToList(exampleArray));

        // List to String
        List<String> exampleList = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        System.out.println("\nList to String:");
        System.out.println(listToString(exampleList));

        // List to Array
        System.out.println("\nList to Array:");
        System.out.println(Arrays.toString(listToArray(exampleList)));
    }
}

