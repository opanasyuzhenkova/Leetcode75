package org.example.arrayString;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    public List<Boolean> candies(int[] candies, int extraCandies) {
        int maxC = 0;
        for (int candy : candies) {
            if (candy > maxC) {
                maxC = candy;
            }
        }

        List<Boolean> res = new ArrayList<>();
        for (int curC : candies) {
            if (curC + extraCandies >= maxC) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
