package org.example.arrayString;

public class increasingTriplet {
    public static boolean triplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for (int n: nums) {
            if (n <= max1) max1 = n;
            else if (n <= max2) max2 = n;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test = {1, 5, 2, 3, 1};
        System.out.println(triplet(test));
    }
}
