package com.array;

public class DuplicateBruteForce {    
    public static void findDuplicates(int[] array) {    
        for (int i = 0; i < array.length; i++) {    
            for (int j = i + 1; j < array.length; j++) {    
                if (array[i] == array[j]) {    
                    System.out.println("Duplicate element found: " + array[i]);    
                    break;    
                }    
            }    
        }    
    }    
    public static void main(String[] args) {    
        int[] array = {4, 5, 6, 7, 5, 6};    
        findDuplicates(array);    
    }    
}  
