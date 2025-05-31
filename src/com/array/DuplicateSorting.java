package com.array;

import java.util.Arrays;

public class DuplicateSorting {  
    public static void findDuplicates(int[] array) {  
        Arrays.sort(array); // Sorting the array  
        for (int i = 0; i < array.length -1 ; i++) {  
            if (array[i] == array[i +1]) {  
                System.out.println("Duplicate element found: " + array[i]);  
            }  
        }  
    }  
    public static void main(String[] args) {  
        int[] array = {4, 5, 6, 7, 5, 6};  
        findDuplicates(array);  
    }  
}  
