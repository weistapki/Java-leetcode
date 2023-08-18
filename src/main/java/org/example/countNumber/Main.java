package org.example.countNumber;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 2, 1};
        int k1 = 1;
        System.out.println(solution.countKDifference(nums1, k1));  // Ожидаемый вывод: 4

        int[] nums2 = {1, 3};
        int k2 = 3;
        System.out.println(solution.countKDifference(nums2, k2));  // Ожидаемый вывод: 0

        int[] nums3 = {3, 2, 1, 5, 4};
        int k3 = 2;
        System.out.println(solution.countKDifference(nums3, k3));  // Ожидаемый вывод: 3
    }
}
