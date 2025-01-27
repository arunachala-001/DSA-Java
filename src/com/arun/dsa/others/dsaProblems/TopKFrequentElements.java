package com.arun.dsa.others.dsaProblems;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3,3,4};
        int k = 2;

        int[] freqElements =findFrequent(nums, k);

        System.out.println(Arrays.toString(freqElements));

    }

    private static int[] findFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];

        freqMap.forEach((num, freq) -> {
            if(bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        });

        List<Integer> result = new ArrayList<>();

        for(int i =bucket.length-1; i>0 && result.size() < k; i--) {
            if(bucket[i] != null)
                result.addAll(bucket[i]);
        }

        return result.stream()
                .mapToInt(i -> i).toArray();
    }
}
