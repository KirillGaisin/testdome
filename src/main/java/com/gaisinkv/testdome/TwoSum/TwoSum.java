package com.gaisinkv.testdome.TwoSum;

import java.util.HashMap;
import java.util.Map;

//30min nested for = efficiency problem
public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        Map<Integer, Integer> indices = new HashMap<>();

        if(list == null || list.length < 2) return null;
        for (int i = 0; i < list.length; i++) {
            int pair = sum - list[i];

            if (indices.get(pair) != null) {
                return new int[]{i, indices.get(pair)};
            }
            indices.put(list[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
