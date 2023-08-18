package org.example.countNumber;


public class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] freq = new int[101];
        int count = 0;

        for (int num : nums) {
            int target1 = num - k;
            int target2 = num + k;

            if (target1 >= 1 && target1 <= 100) {
                count += freq[target1];
            }
            if (target2 >= 1 && target2 <= 100) {
                count += freq[target2];
            }

            freq[num]++;
        }

        return count;
    }
}
