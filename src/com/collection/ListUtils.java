 package com.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ListUtils {

    // 1. Add elements to list
    public static ArrayList<String> createList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java"); // Duplicate
        return list;
    }

    // 2. Display list
    public static void displayList(ArrayList<String> list) {
        System.out.println("List: " + list);
    }

    // 3. Remove an element by value
    public static void removeElement(ArrayList<String> list, String value) {
        list.remove(value);
        System.out.println("After removing '" + value + "': " + list);
    }

    // 4. Check if element exists
    public static void checkExists(ArrayList<String> list, String value) {
        System.out.println("Contains '" + value + "'? " + list.contains(value));
    }

    // 5. Get element by index
    public static void getElement(ArrayList<String> list, int index) {
        System.out.println("Element at index " + index + ": " + list.get(index));
    }

    // 6. Replace element at index
    public static void replaceElement(ArrayList<String> list, int index, String value) {
        list.set(index, value);
        System.out.println("After replacement: " + list);
    }

    // 7. Get size of list
    public static void getSize(ArrayList<String> list) {
        System.out.println("Size: " + list.size());
    }

    // 8. Iterate list
    public static void iterateList(ArrayList<String> list) {
        System.out.print("Iterating: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // 9. Add all elements from another list
    public static void addAll(ArrayList<String> list1, ArrayList<String> list2) {
        list1.addAll(list2);
        System.out.println("After addAll: " + list1);
    }

    // 10. Remove all elements from another list
    public static void removeAll(ArrayList<String> list1, ArrayList<String> list2) {
        list1.removeAll(list2);
        System.out.println("After removeAll: " + list1);
    }

    // 11. Retain common elements
    public static void retainAll(ArrayList<String> list1, ArrayList<String> list2) {
        list1.retainAll(list2);
        System.out.println("After retainAll: " + list1);
    }

    // 12. Clear list
    public static void clearList(ArrayList<String> list) {
        list.clear();
        System.out.println("List cleared.");
    }

    // 13. Is list empty
    public static void isEmpty(ArrayList<String> list) {
        System.out.println("Is empty? " + list.isEmpty());
    }

    // 14. Find duplicates manually
    public static void findDuplicates(ArrayList<String> list) {
        System.out.print("Duplicates: ");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    System.out.print(list.get(i) + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    // 15. Reverse list
    public static void reverseList(ArrayList<String> list) {
        System.out.print("Reversed: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // 16. Get sublist manually
    public static void getSubList(ArrayList<String> list, int start, int end) {
        System.out.print("Sublist: ");
        for (int i = start; i < end && i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // 17. Find index of element
    public static void indexOfElement(ArrayList<String> list, String value) {
        System.out.println("Index of '" + value + "': " + list.indexOf(value));
    }

    // 18. Convert to array
    public static void toArray(ArrayList<String> list) {
        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.print("Array: ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // 19. Print even indexed elements
    public static void printEvenIndexed(ArrayList<String> list) {
        System.out.print("Even indexed: ");
        for (int i = 0; i < list.size(); i += 2) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // 20. Print odd indexed elements
    public static void printOddIndexed(ArrayList<String> list) {
        System.out.print("Odd indexed: ");
        for (int i = 1; i < list.size(); i += 2) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // 21. Clone list manually
    public static ArrayList<String> cloneList(ArrayList<String> list) {
        ArrayList<String> clone = new ArrayList<>();
        for (String s : list) {
            clone.add(s);
        }
        return clone;
    }

    // 22. Compare lists
    public static void compareLists(ArrayList<String> list1, ArrayList<String> list2) {
        System.out.println("Lists equal? " + list1.equals(list2));
    }

    // 23. Replace all occurrences manually
    public static void replaceAll(ArrayList<String> list, String oldVal, String newVal) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldVal)) {
                list.set(i, newVal);
            }
        }
        System.out.println("After replaceAll: " + list);
    }

    // 24. Count occurrences of element
    public static void countOccurrences(ArrayList<String> list, String value) {
        int count = 0;
        for (String s : list) {
            if (s.equals(value)) count++;
        }
        System.out.println("Occurrences of '" + value + "': " + count);
    }

    // 25. Sort manually using bubble sort (ascending)
    public static void sortList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("Sorted list: " + list);
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = createList();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Go");

        displayList(list1);
        removeElement(list1, "Java");
        checkExists(list1, "Python");
        getElement(list1, 1);
        replaceElement(list1, 1, "Scala");
        getSize(list1);
        iterateList(list1);
        addAll(list1, list2);
        removeAll(list1, list2);
        retainAll(list1, list2);
        isEmpty(list1);
        findDuplicates(list1);
        reverseList(list1);
        getSubList(list1, 0, 2);
        indexOfElement(list1, "C++");
        toArray(list1);
        printEvenIndexed(list1);
        printOddIndexed(list1);
        ArrayList<String> clone = cloneList(list1);
        compareLists(list1, clone);
        replaceAll(list1, "C++", "Kotlin");
        countOccurrences(list1, "Java");
        sortList(list1);
        clearList(list1);
    }
}
