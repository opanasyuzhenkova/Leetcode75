package org.example.daily;

import java.util.PriorityQueue;

public class totalCost {
    public static long tCost(int[] costs, int k, int candidates) {
        int i = 0;
        int j = costs.length - 1;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        long result = 0;
        while (k --> 0) {
            while (pq1.size() < candidates && i <= j) {
                pq1.offer(costs[i++]);
            }
            while (pq2.size() < candidates && i<= j) {
                pq2.offer(costs[j--]);
            }
            int t1 = pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;
            int t2 = pq2.size() > 0 ? pq2.peek() : Integer.MAX_VALUE;

            if (t1 <= t2) {
                result += t1;
                pq1.poll();
            } else {
                result += t2;
                pq2.poll();
            }

        }
    return result;
    }

    public static void main(String[] args) {
        System.out.println(tCost(new int[] {1,4,9, 2, 3,6,7}, 3, 4));
    }
}
