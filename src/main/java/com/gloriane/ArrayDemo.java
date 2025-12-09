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
        int[] nums = {1, 15, 20};
        int[] copiedNums = Arrays.copyOf(nums, nums.length);
        System.out.println("Copied array: " + Arrays.toString(copiedNums));

        System.out.println("======= Ex5 =======");
        String[][] vals = {{"France", "Paris"}, {"Sweden", "Stockholm"}};
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals[i].length; j++) {
                System.out.println(vals[i][j]);
            }
        }
        System.out.println("======= Ex6 =======");
        int[] arr = {43, 5, 17, 2, 14};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("Average: " + average);

        System.out.println("======= Ex7 =======");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 9, 12};
        System.out.println("Even numbers:");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("Odd numbers:");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println("======= Ex8 =======");
        int[] arr1 = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int[] unique = new int[arr1.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr1[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unique[count++] = arr1[i];
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(unique[i]);
        }

        System.out.println("======= Ex9 =======");
        int[] arr2 = {1, 2, 3};
        arr2 = addElement(arr2, 4);
        arr2 = addElement(arr2, 5);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] addElement(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }
}


