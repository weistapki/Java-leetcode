package org.example.anagram;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(solution.isAnagram(s1, t1)); // Output: true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(solution.isAnagram(s2, t2)); // Output: false
    }
}
