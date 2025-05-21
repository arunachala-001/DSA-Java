package com.arun.dsa.others.dsaProblems;

public class MaxSumOfSubArray {

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(findMaxSumOfSubArray(arr));
    }

    private static int findMaxSumOfSubArray(int[] arr) {
        int sum =0;
        int MAX_VAL = Integer.MIN_VALUE;

        for(int i: arr) {
            sum+=i;
            if(sum > MAX_VAL) {
                MAX_VAL = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return MAX_VAL;
    }
}
