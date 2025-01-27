package com.arun.dsa.others.map;

import java.util.*;

public class MapExercise {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Arun", 1);
        map.put("Chandran", 2);
        map.put("Dhanush", 3);

        Set<Map.Entry<String, Integer>> mapEntrySet = map.entrySet();

        for(Map.Entry<String,Integer> m: mapEntrySet) {
            System.out.println(m.getKey() +" : "+ m.getValue());
        }

        int[] arr = {23, 5, 90, 3, 19};
        int k = 2;
        System.out.println(findKthHighestElement(arr, k));
    }

    private static int findKthHighestElement(int[] arr, int k) {
        return Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

    }
}
