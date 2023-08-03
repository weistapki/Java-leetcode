package org.example.bestTime;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] sharePrice = new int[]{7,1,5,3,6,4};
        System.out.println("The Maximum profit:" + solution.maxProfit(sharePrice));
    }
}
