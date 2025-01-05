package com.arun.dsa.sortingAlgo;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5,9,6,4,3,8,1,2};

        MergeSort ms = new MergeSort();
        int[] sortedArray =  ms.mergeSort(arr);

        Arrays.stream(sortedArray).forEach(System.out::println);
    }

    public int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeLeftRight(left, right);
    }

    private int[] mergeLeftRight(int[] left, int[] right) {
        int k =0;
        int i =0;
        int j=0;
        int[] join = new int[left.length + right.length];
        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                join[k++] = left[i++];
            }
            else
                join[k++] = right[j++];
        }

        while(i < left.length) {
            join[k++] = left[i++];
        }

        while(j < right.length) {
            join[k++] = right[j++];
        }

        return join;
    }
}
