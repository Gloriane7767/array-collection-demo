package com.gloriane;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("======= Ex1 =======");
        int[] numbers = {11, 23, 39, 45, 50};
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("======= Ex2 =======");
        int[] number = {3, 7, 5, 9, 12};
        int index = indexOf(number, 5);
        System.out.println("Index position of number 5 is: " + index);
        
        System.out.println("======= Ex3 =======");
        String[] countries = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(countries);
        System.out.println("Sorted countries:");
        for (String country : countries) {
            System.out.println(country);
        }
        
        System.out.println("======= Ex4 =======");
    }

    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }
}


