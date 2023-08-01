package org.example.anagram.polindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder fixedString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                fixedString.append(c);
            }
        }
        fixedString = new StringBuilder(fixedString.toString().toLowerCase());
        int frontPointer = 0;
        int backPointer = fixedString.length() - 1;

        while (frontPointer <= backPointer) {
            if (fixedString.charAt(frontPointer) != fixedString.charAt(backPointer)) {
                return false;
            }
            frontPointer++;
            backPointer--;
        }
        return true;
    }
}
