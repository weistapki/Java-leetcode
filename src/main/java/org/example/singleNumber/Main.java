package org.example.singleNumber;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        Solution solution = new Solution();

        int result1 = solution.singleNumber(nums1);
        int result2 = solution.singleNumber(nums2);
        int result3 = solution.singleNumber(nums3);

        System.out.println("Result 1: " + result1); // Вывод: 1
        System.out.println("Result 2: " + result2); // Вывод: 4
        System.out.println("Result 3: " + result3); // Вывод: 1
    }
}
