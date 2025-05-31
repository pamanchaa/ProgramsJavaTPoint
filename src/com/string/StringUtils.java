 package com.string;
public class StringUtils {

    // 1. Count total characters in a string
    public static int countTotalCharacters(String str) {
        return str.length();
    }

    // 2. Duplicate of 1 - Count total characters
    public static int countTotalCharacters2(String str) {
        return str.length();
    }

    // 3. Count punctuation characters
    public static int countPunctuation(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }

    // 4. Count vowels and consonants
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) >= 0) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    // 5. Check anagram
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] count = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int c : count) if (c != 0) return false;
        return true;
    }

    // 6. Divide string in N equal parts
    public static void divideString(String str, int n) {
        int len = str.length();
        if (len % n != 0) {
            System.out.println("Cannot divide into equal parts");
            return;
        }
        int partSize = len / n;
        for (int i = 0; i < len; i += partSize) {
            System.out.println(str.substring(i, i + partSize));
        }
    }

    // 7. Find all subsets
    public static void findSubsets(String str) {
        int len = str.length();
        for (int i = 0; i < (1 << len); i++) {
            StringBuilder subset = new StringBuilder();
            for (int j = 0; j < len; j++) {
                if ((i & (1 << j)) != 0) subset.append(str.charAt(j));
            }
            System.out.println(subset);
        }
    }

    // 8. Longest repeating sequence
    public static String longestRepeatingSequence(String str) {
        int n = str.length();
        String res = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int len = 0;
                while (j + len < n && str.charAt(i + len) == str.charAt(j + len)) {
                    len++;
                    if (len > res.length()) {
                        res = str.substring(i, i + len);
                    }
                }
            }
        }
        return res;
    }

    // 9. Permutations
    public static void permutations(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permutations(str.substring(0, i) + str.substring(i + 1), ans + str.charAt(i));
        }
    }

    // 10. Remove white spaces
    public static String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    // 11. Swap case
    public static String swapCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
            else if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else sb.append(c);
        }
        return sb.toString();
    }

    // 12. Replace space with specific char
    public static String replaceSpaces(String str, char ch) {
        return str.replace(' ', ch);
    }

    // 13. Palindrome check
    public static boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    // 14. Rotation
    public static boolean isRotation(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

    // 15. Max and min occurring char
    public static void maxMinChar(String str) {
        int[] count = new int[256];
        for (char c : str.toCharArray()) count[c]++;
        int max = 0, min = Integer.MAX_VALUE;
        char maxChar = ' ', minChar = ' ';
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0 && count[i] > max) {
                max = count[i]; maxChar = (char) i;
            }
            if (count[i] > 0 && count[i] < min) {
                min = count[i]; minChar = (char) i;
            }
        }
        System.out.println("Max: " + maxChar + ", Min: " + minChar);
    }

    // 16. Reverse string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 17. Duplicate characters
    public static void duplicateChars(String str) {
        int[] count = new int[256];
        for (char c : str.toCharArray()) count[c]++;
        for (int i = 0; i < 256; i++) if (count[i] > 1) System.out.println((char) i);
    }

    // 18. Duplicate words
    public static void duplicateWords(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println(words[i]);
                    break;
                }
            }
        }
    }

    // 19. Character frequency
    public static void charFrequency(String str) {
        int[] count = new int[256];
        for (char c : str.toCharArray()) count[c]++;
        for (int i = 0; i < 256; i++) if (count[i] > 0) System.out.println((char) i + ": " + count[i]);
    }

    // 20. Largest and smallest word
    public static void largestSmallestWord(String str) {
        String[] words = str.split(" ");
        String smallest = words[0], largest = words[0];
        for (String word : words) {
            if (word.length() < smallest.length()) smallest = word;
            if (word.length() > largest.length()) largest = word;
        }
        System.out.println("Smallest: " + smallest + ", Largest: " + largest);
    }

    // 21. Most repeated word in file (mock implementation)
    public static void mostRepeatedWord(String text) {
        String[] words = text.split(" ");
        int maxCount = 0;
        String word = "";
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                word = words[i];
            }
        }
        System.out.println("Most repeated: " + word);
    }

    // 22. Word count
    public static int wordCount(String str) {
        return str.trim().split("\\s+").length;
    }

    // 23. Separate characters
    public static void separateChars(String str) {
        for (char c : str.toCharArray()) System.out.println(c);
    }

    // 24. Swap strings
    public static void swapStrings(String a, String b) {
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("a: " + a + ", b: " + b);
    }

    // 25. Smallest and biggest palindrome word
    public static void smallestBiggestPalindrome(String str) {
        String[] words = str.split(" ");
        String smallest = null, biggest = null;
        for (String word : words) {
            if (isPalindrome(word)) {
                if (smallest == null || word.length() < smallest.length()) smallest = word;
                if (biggest == null || word.length() > biggest.length()) biggest = word;
            }
        }
        System.out.println("Smallest palindrome: " + smallest);
        System.out.println("Biggest palindrome: " + biggest);
    }

    // 26. Reverse string word by word
    public static void reverseWords(String str) {
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) System.out.print(words[i] + " ");
        System.out.println();
    }

    // 27. Reverse string without reverse()
    public static String manualReverse(String str) {
        char[] chars = str.toCharArray();
        String rev = "";
        for (int i = chars.length - 1; i >= 0; i--) rev += chars[i];
        return rev;
    }

    public static void main(String[] args) {
        String str = "hello world! java is fun. fun fun hello";
        System.out.println("Total Characters: " + countTotalCharacters(str));
        System.out.println("Punctuation Count: " + countPunctuation(str));
        countVowelsAndConsonants(str);
        System.out.println("Anagram: " + isAnagram("listen", "silent"));
        divideString("abcdefgh", 4);
        findSubsets("abc");
        System.out.println("Longest Repeating Sequence: " + longestRepeatingSequence("aabcaabc"));
        permutations("abc", "");
        System.out.println("Without spaces: " + removeSpaces(str));
        System.out.println("Swap case: " + swapCase("Java123"));
        System.out.println("Replace spaces: " + replaceSpaces(str, '-'));
        System.out.println("Palindrome: " + isPalindrome("madam"));
        System.out.println("Rotation: " + isRotation("abcd", "cdab"));
        maxMinChar(str);
        System.out.println("Reverse: " + reverseString(str));
        duplicateChars("programming");
        duplicateWords(str);
        charFrequency("programming");
        largestSmallestWord(str);
        mostRepeatedWord(str);
        System.out.println("Word count: " + wordCount(str));
        separateChars("abc");
        swapStrings("hello", "world");
        smallestBiggestPalindrome("wow level noon racecar madam abcde");
        reverseWords("Java is fun");
        System.out.println("Manual reverse: " + manualReverse("reverse"));
    }
}
