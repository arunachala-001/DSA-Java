package com.arun.dsa.stack;

import java.util.Stack;

public class StackExercise {

    public static void main(String[] args) {
        String bracket = "{[()]}";
        System.out.println(isValidBraces(bracket));
    }

    private static boolean isValidBraces(String bracket) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<bracket.length(); i++) {
            if(bracket.charAt(i) == '{' || bracket.charAt(i) == '[' || bracket.charAt(i) == '(') {
                stack.push(bracket.charAt(i));
                continue;
            }
            switch (bracket.charAt(i)) {
                case '}':
                    if(!stack.peek().equals('{')) {
                        return false;
                    }
                    stack.pop();
                    break;

                case ']' :
                    if(!stack.peek().equals('[')) {
                        return false;
                    }
                    stack.pop();
                    break;

                case ')' :
                    if(!stack.peek().equals('(')) {
                        return false;
                    }
                    stack.pop();
                    break;
            }

        }
        if(stack.isEmpty()) {
            return true;
        }

        return false;
    }
}
