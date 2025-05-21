package com.arun.dsa.others.dsaProblems;

import java.util.PriorityQueue;

public class TopKHighestElement {

    public static void main(String[] args) {
        int[] arr = {8,4,2,6,10,3};
        int K = 2;

        System.out.println(findTopKElement(arr, K));
    }

    private static int findTopKElement(int[] arr, int k) {
        PriorityQueue<Integer> MIN_HEAP = new PriorityQueue<>();

        for(int i:arr) {
            if(MIN_HEAP.size() <= k || i > MIN_HEAP.peek()) {
                MIN_HEAP.add(i);
            }
            if(MIN_HEAP.size() > k) {
                MIN_HEAP.poll();
            }
        }
        return MIN_HEAP.peek();
    }
}
