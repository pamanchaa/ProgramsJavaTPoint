public class ArrayUtils {

    // Count number of elements
    public static int countElements(int[] arr) {
        return arr.length;
    }

    // Print duplicates in the array
    public static void printDuplicates(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    isDuplicate = true;
                }
            }
            if (isDuplicate) System.out.println("Duplicate: " + arr[i]);
        }
    }

    // Remove duplicates and return new array
    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[index++] = arr[i];
            }
        }
        int[] result = new int[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    // Sort ascending
    public static void sortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
                }
            }
        }
    }

    // Sort descending
    public static void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
                }
            }
        }
    }

    // Reverse array
    public static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int t = arr[start]; arr[start] = arr[end]; arr[end] = t;
            start++; end--;
        }
    }

    // Rotate right by n
    public static void rotateRight(int[] arr, int n) {
        n %= arr.length;
        for (int i = 0; i < n; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }

    // Rotate left by n
    public static void rotateLeft(int[] arr, int n) {
        n %= arr.length;
        for (int i = 0; i < n; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
    }

    // Merge two arrays
    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) result[i] = a[i];
        for (int i = 0; i < b.length; i++) result[a.length + i] = b[i];
        return result;
    }

    // Find largest
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;
        return max;
    }

    // Find smallest
    public static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int val : arr) if (val < min) min = val;
        return min;
    }

    // Find second largest
    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        }
        return second;
    }

    // Find third largest
    public static int findThirdLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second && n != first) {
                third = second;
                second = n;
            } else if (n > third && n != second && n != first) {
                third = n;
            }
        }
        return third;
    }

    // Sum of all elements
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    // Print elements on even positions
    public static void printEvenPositions(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println("Even Pos " + i + ": " + arr[i]);
        }
    }

    // Print elements on odd positions
    public static void printOddPositions(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println("Odd Pos " + i + ": " + arr[i]);
        }
    }

    // Print even numbers
    public static void printEvenNumbers(int[] arr) {
        for (int i : arr) if (i % 2 == 0) System.out.print(i + " ");
        System.out.println();
    }

    // Print odd numbers
    public static void printOddNumbers(int[] arr) {
        for (int i : arr) if (i % 2 != 0) System.out.print(i + " ");
        System.out.println();
    }

    // Copy array
    public static int[] copy(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) copy[i] = arr[i];
        return copy;
    }

    // Frequency of each element
    public static void frequency(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " time(s)");
        }
    }

    // Demo runner
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 5, 3, 2, 8, 1};

        System.out.println("Original:");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();

        System.out.println("Duplicates:");
        printDuplicates(arr);

        System.out.println("Removed Duplicates:");
        int[] noDup = removeDuplicates(arr);
        for (int i : noDup) System.out.print(i + " ");
        System.out.println();

        System.out.println("Sorted:");
        sortAscending(arr);
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
