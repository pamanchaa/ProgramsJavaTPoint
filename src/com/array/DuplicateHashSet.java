package com.array;

import java.util.HashSet;
import java.util.Arrays;



public class DuplicateHashSet {  
    public static void findDuplicates(int[] array) {  
        HashSet<Integer> seen = new HashSet<>();  
        for (int num : array) {  
            if (!seen.add(num)) {  
                System.out.println("Duplicate element found: " + num);  
            }  
        }  
    }  
    public static void main(String[] args) {  
        int[] array = {4, 5, 6, 7, 5, 6};  
        findDuplicates(array);  
    }  
}  