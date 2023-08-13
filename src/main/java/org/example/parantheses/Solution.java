package org.example.parantheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String mapping = "({[";
        String closing = ")}]";

        for (char c : s.toCharArray()) {
            if (mapping.indexOf(c) != -1) {
                stack.push(c);
            } else if (closing.indexOf(c) != -1) {
                if (stack.isEmpty() || mapping.indexOf(stack.pop()) != closing.indexOf(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
