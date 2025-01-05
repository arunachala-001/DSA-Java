package com.arun.dsa.sortingAlgo;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5,8,4,3,7,6,2,9,5};
        int low = 0;
        int high = arr.length-1;
        quicksort(arr, low, high);

        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = (start+end)/2;
        int pivot = arr[mid];

        while(start<=end) {
            while(arr[start] < pivot) {
                start++;
            }
            while(arr[end] > pivot) {
                end--;
            }
            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quicksort(arr, low, end);
        quicksort(arr, start, high);


    }
}
