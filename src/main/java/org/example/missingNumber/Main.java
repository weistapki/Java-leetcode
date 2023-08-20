package org.example.missingNumber;


public class Main {
    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        Solution solution = new Solution();

        int result1 = solution.missingNumber(nums1);
        int result2 = solution.missingNumber(nums2);
        int result3 = solution.missingNumber(nums3);

        System.out.println("Result 1: " + result1); // Вывод: 2
        System.out.println("Result 2: " + result2); // Вывод: 2
        System.out.println("Result 3: " + result3); // Вывод: 8
    }
}
