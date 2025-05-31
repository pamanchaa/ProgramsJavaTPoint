package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArraysUtils {

    // 1️⃣ Print Array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // 2️⃣ Sort Array (Ascending Order)
    public static void sortArrayAscending(int[] arr) {
        Arrays.sort(arr);
    }

    // 3️⃣ Sort Array (Descending Order)
    public static void sortArrayDescending(int[] arr) {
        Arrays.sort(arr);
        reverseArray(arr);
    }

    // 4️⃣ Reverse Array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // 5️⃣ Find Largest Element
    public static int findLargest(int[] arr) {
        return Arrays.stream(arr).max().orElseThrow();
    }

    // 6️⃣ Find Second & Third Largest Elements
    public static int findSecondLargest(int[] arr) {
        return Arrays.stream(arr)
                     .distinct()
                     .sorted()
                     .toArray()[arr.length - 2];
    }

    public static int findThirdLargest(int[] arr) {
        return Arrays.stream(arr)
                     .distinct()
                     .sorted()
                     .toArray()[arr.length - 3];
    }

    // 7️⃣ Find Smallest Element
    public static int findSmallest(int[] arr) {
        return Arrays.stream(arr).min().orElseThrow();
    }

    // 8️⃣ Count Number of Elements
    public static int countElements(int[] arr) {
        return arr.length;
    }

    // 9️⃣ Remove Duplicates
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    // 🔟 Merge Two Arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        return merged;
    }

    // 1️⃣1️⃣ Copy Array
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // 1️⃣2️⃣ Find Frequency of Each Element
    public static Map<Integer, Integer> countFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    // 1️⃣3️⃣ Print Elements at Even & Odd Positions
    public static void printEvenOddPositions(int[] arr) {
        System.out.print("Elements at Even Positions: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Elements at Odd Positions: ");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 1️⃣4️⃣ Print Even & Odd Numbers
    public static void printEvenOddNumbers(int[] arr) {
        System.out.print("Even Numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Odd Numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) System.out.print(num + " ");
        }
        System.out.println();
    }

    // 1️⃣5️⃣ Rotate Right by K Positions
    public static void rotateRight(int[] arr, int k) {
        k = k % arr.length;
        reverseArrayRange(arr, 0, arr.length - 1);
        reverseArrayRange(arr, 0, k - 1);
        reverseArrayRange(arr, k, arr.length - 1);
    }

    // 1️⃣6️⃣ Rotate Left by K Positions
    public static void rotateLeft(int[] arr, int k) {
        k = k % arr.length;
        reverseArrayRange(arr, 0, k - 1);
        reverseArrayRange(arr, k, arr.length - 1);
        reverseArrayRange(arr, 0, arr.length - 1);
    }

    private static void reverseArrayRange(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // 📌 Main Method for Testing
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 3, 1, 9, 7, 5, 8};

        System.out.println("Original Array:");
        printArray(numbers);

        System.out.println("\nSorted Array (Ascending):");
        sortArrayAscending(numbers);
        printArray(numbers);

        reverseArray(numbers);
        System.out.println("\nSorted Array (Descending):");
        printArray(numbers);

        System.out.println("\nLargest Element: " + findLargest(numbers));
        System.out.println("Second Largest Element: " + findSecondLargest(numbers));
        System.out.println("Third Largest Element: " + findThirdLargest(numbers));

        System.out.println("\nSmallest Element: " + findSmallest(numbers));
        System.out.println("Total Elements: " + countElements(numbers));

        System.out.println("\nArray After Removing Duplicates:");
        int[] uniqueNumbers = removeDuplicates(numbers);
        printArray(uniqueNumbers);

        System.out.println("\nFrequency of Elements:");
        countFrequency(numbers).forEach((key, value) -> System.out.println(key + " appears " + value + " times"));

        System.out.println("\nElements at Even & Odd Positions:");
        printEvenOddPositions(numbers);

        System.out.println("\nEven & Odd Numbers:");
        printEvenOddNumbers(numbers);

        rotateRight(numbers, 3);
        System.out.println("\nArray After Right Rotation (3 positions):");
        printArray(numbers);

        rotateLeft(numbers, 3);
        System.out.println("\nArray After Left Rotation (3 positions):");
        printArray(numbers);
    }
}
