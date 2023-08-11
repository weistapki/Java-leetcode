package org.example.lengthOfLastWord;

public class Solution {
    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;

        // Skip spaces from the end of the string
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        int start = end;

        // Go backwards to the first space or the beginning of the string
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return end - start;
    }
}
//    Use two pointers (or indices) to calculate the
//    length of the last word. One pointer will move
//    backward from the end of the string, while the
//    other will move forward until it reaches the first space.
//    When the second pointer reaches a space,
//    we will have the starting and ending positions of the last word,
//    allowing us to calculate its length.