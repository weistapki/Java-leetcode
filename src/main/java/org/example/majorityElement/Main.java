package org.example.majorityElement;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] exampleOne = {3,2,3};
        int[] exampleTwo = {2,2,1,1,1,2,2};

        System.out.println("Example One : " + solution.majorityElement(exampleOne));//Output: 3
        System.out.println("Example Two : " + solution.majorityElement(exampleTwo));//Output: 2
    }
}
