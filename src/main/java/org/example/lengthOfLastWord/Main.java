package org.example.lengthOfLastWord;

import static org.example.lengthOfLastWord.Solution.lengthOfLastWord;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));  // Output: 5

        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s2));  // Output: 4

        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s3));  // Output: 6
    }
}
