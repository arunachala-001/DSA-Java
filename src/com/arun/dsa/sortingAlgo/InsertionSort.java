package com.arun.dsa.sortingAlgo;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {10, 1, 9, 8, 7};
        insertion(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void insertion(int[] arr) {
        for(int i =1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

    }
}
