import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetUtils {

    // 1. Add elements to the set
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate will not be added
        return set;
    }

    // 2. Display all elements in the set
    public static void displaySet(Set<String> set) {
        System.out.println("Set elements: " + set);
    }

    // 3. Remove an element from the set
    public static void removeElement(Set<String> set, String element) {
        set.remove(element);
        System.out.println("After removing '" + element + "': " + set);
    }

    // 4. Check if element exists in the set
    public static void checkElementExists(Set<String> set, String element) {
        boolean exists = set.contains(element);
        System.out.println("Contains '" + element + "'? " + exists);
    }

    // 5. Get the size of the set
    public static void printSize(Set<String> set) {
        System.out.println("Size of set: " + set.size());
    }

    // 6. Clear the set
    public static void clearSet(Set<String> set) {
        set.clear();
        System.out.println("Set cleared. Current size: " + set.size());
    }

    // 7. Iterate over elements using iterator
    public static void iterateSet(Set<String> set) {
        System.out.print("Iterating: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    // 8. Union of two sets
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        for (String item : set2) {
            result.add(item);
        }
        return result;
    }

    // 9. Intersection of two sets
    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>();
        for (String item : set1) {
            if (set2.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // 10. Difference of two sets
    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>();
        for (String item : set1) {
            if (!set2.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // 11. Check if one set is subset of another
    public static boolean isSubset(Set<String> set1, Set<String> set2) {
        return set2.containsAll(set1);
    }

    // 12. Convert set to array
    public static void setToArray(Set<String> set) {
        String[] arr = new String[set.size()];
        int i = 0;
        for (String s : set) {
            arr[i++] = s;
        }
        System.out.print("Set to array: ");
        for (String val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // 13. Clone a set manually
    public static Set<String> cloneSet(Set<String> set) {
        Set<String> clone = new HashSet<>();
        for (String s : set) {
            clone.add(s);
        }
        return clone;
    }

    // 14. Compare two sets for equality
    public static boolean areEqual(Set<String> set1, Set<String> set2) {
        return set1.equals(set2);
    }

    // 15. Add all elements from one set to another
    public static void addAll(Set<String> target, Set<String> source) {
        for (String s : source) {
            target.add(s);
        }
        System.out.println("After adding all: " + target);
    }

    // 16. Remove all elements from another set
    public static void removeAll(Set<String> target, Set<String> toRemove) {
        for (String s : toRemove) {
            target.remove(s);
        }
        System.out.println("After removing all from second set: " + target);
    }

    // 17. Retain only common elements between sets
    public static void retainAll(Set<String> target, Set<String> other) {
        target.retainAll(other);
        System.out.println("After retaining common: " + target);
    }

    // 18. Check if set is empty
    public static boolean isEmpty(Set<String> set) {
        return set.isEmpty();
    }

    // 19. Add null to a set (HashSet supports it)
    public static void addNull(Set<String> set) {
        set.add(null);
        System.out.println("After adding null: " + set);
    }

    // 20. Find number of null elements (usually 0 or 1 in Set)
    public static int countNulls(Set<String> set) {
        int count = 0;
        for (String s : set) {
            if (s == null) count++;
        }
        return count;
    }

    // 21. Find elements starting with a prefix
    public static void printStartsWith(Set<String> set, String prefix) {
        System.out.print("Elements starting with '" + prefix + "': ");
        for (String s : set) {
            if (s != null && s.startsWith(prefix)) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }

    // 22. Print elements in uppercase
    public static void printUpperCase(Set<String> set) {
        System.out.print("Uppercase set: ");
        for (String s : set) {
            if (s != null) System.out.print(s.toUpperCase() + " ");
        }
        System.out.println();
    }

    // 23. Count elements with length > n
    public static int countByLength(Set<String> set, int n) {
        int count = 0;
        for (String s : set) {
            if (s != null && s.length() > n) {
                count++;
            }
        }
        return count;
    }

    // 24. Convert set to comma-separated string
    public static String toCommaSeparated(Set<String> set) {
        StringBuilder sb = new StringBuilder();
        for (String s : set) {
            if (s != null) {
                sb.append(s).append(", ");
            }
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "";
    }

    // 25. Remove nulls from set
    public static void removeNulls(Set<String> set) {
        set.remove(null);
        System.out.println("After removing nulls: " + set);
    }

    public static void main(String[] args) {
        Set<String> set1 = createSet();
        Set<String> set2 = new HashSet<>();
        set2.add("C++");
        set2.add("Go");

        displaySet(set1);
        removeElement(set1, "Java");
        checkElementExists(set1, "Python");
        printSize(set1);
        iterateSet(set1);

        Set<String> union = union(set1, set2);
        System.out.println("Union: " + union);

        Set<String> intersection = intersection(set1, set2);
        System.out.println("Intersection: " + intersection);

        Set<String> diff = difference(set1, set2);
        System.out.println("Difference: " + diff);

        System.out.println("Is Subset? " + isSubset(set1, union));
        setToArray(set1);

        Set<String> clone = cloneSet(set1);
        System.out.println("Cloned set: " + clone);

        System.out.println("Are Equal? " + areEqual(set1, clone));

        addAll(set1, set2);
        removeAll(set1, set2);

        retainAll(set1, clone);
        System.out.println("Is Empty? " + isEmpty(set1));

        addNull(set1);
        System.out.println("Null Count: " + countNulls(set1));

        printStartsWith(set1, "P");
        printUpperCase(set1);

        System.out.println("Count > 3 length: " + countByLength(set1, 3));
        System.out.println("Comma-separated: " + toCommaSeparated(set1));

        removeNulls(set1);
        clearSet(set1);
    }
}
