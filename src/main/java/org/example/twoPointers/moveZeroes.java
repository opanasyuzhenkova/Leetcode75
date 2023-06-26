package org.example.twoPointers;

import java.util.Arrays;

public class moveZeroes {
    public static String zeroes(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp ++;
            } else {
                int t = nums[i];
                nums[i] = 0;
                nums[i - temp] = t;
            }
        }
        return Arrays.toString(nums);
    }

    public static void main(String[] args) {
        System.out.println(zeroes(new int[] {0, 1, 0, 3, 12}));
    }

}
