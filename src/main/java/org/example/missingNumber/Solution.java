package org.example.missingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result = 0;

        // Выполняем XOR со всеми числами от 0 до n
        for (int i = 0; i <= n; i++) {
            result ^= i;
        }

        // Выполняем XOR всех чисел из массива
        for (int i = 0; i < n; i++) {
            result ^= nums[i];
        }

        return result;
//        int n = nums.length;
//        int totalSum = (n * (n + 1)) / 2; // Сумма всех чисел от 0 до n
//        int sumOfNums = 0; // Сумма чисел в массиве nums
//
//        for (int num : nums) {
//            sumOfNums += num;
//        }
//
//        return totalSum - sumOfNums;
    }

}
