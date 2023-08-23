package org.example.singleNumber;

public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0; // Create a variable to store the unique element, initialize it to 0

        for (int num : nums) { // Iterate through all elements in the array
            result ^= num; // Perform the XOR operation between the current result and the current element num
        }

        return result; // Return the unique element that remains after the XOR operations
    }
}

