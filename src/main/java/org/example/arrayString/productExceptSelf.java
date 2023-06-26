package org.example.arrayString;

import java.util.Arrays;

public class productExceptSelf {
    public static int[] product(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int cur = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= cur;
            cur *= nums[i];
        }
        cur = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= cur;
            cur *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] result = product(new int[] {1, 2, 3, 4});
        System.out.println(Arrays.toString(result));
    }
}
