package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsMap = new HashMap<>();
        int res1 = -1;
        int res2 = -1;
        int subtraction;

        for (int i = 0; i < nums.length; i++) {
            subtraction = target - nums[i];
            if (numsMap.containsKey(subtraction)) {
                return new int[] {numsMap.get(subtraction), i};
            }
            numsMap.put(nums[i], i);
        }

        return null;
    }
}