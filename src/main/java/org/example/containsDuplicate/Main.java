package org.example.containsDuplicate;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] exampleOne = {1, 2, 3, 1};
        int[] exampleTwo = {1, 2, 3, 4};
        int[] exampleTree = {1,1,1,3,3,4,3,2,4,2};

        System.out.println("Example One : " + solution.containsDuplicate(exampleOne));//true
        System.out.println("Example Two : " + solution.containsDuplicate(exampleTwo));//false
        System.out.println("Example Tree : " + solution.containsDuplicate(exampleTree));//true

    }
}
