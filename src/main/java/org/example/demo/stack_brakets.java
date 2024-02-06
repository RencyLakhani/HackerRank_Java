package org.example.demo;

import java.util.Scanner;
import java.util.Stack;

public class stack_brakets {

//    public boolean checkBalanced(String tree) {
//
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(checkpattern(input));
        }

    }

    private static boolean checkpattern(String input) {
        Stack st = new Stack();
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(' || array[i] == '{' || array[i] == '[') {
                st.push(array[i]);
            }
            else {
                if (st.isEmpty()) {
                    return false; // No matching opening parenthesis
                }

                char top = (char) st.pop();

                if ((top == '{' && array[i] != '}') ||
                        (top == '(' && array[i] != ')') ||
                        (top == '[' && array[i] != ']')) {
                    return false; // Mismatched parentheses
                }
            }

//            else {
//                if (st.peek().equals('{') && array[i] == '}') {
//                    st.pop();
//                } else if (st.peek().equals('(') && array[i] == ')') {
//                    st.pop();
//                }else if (st.peek().equals('[') && array[i] == ']'){
//                    st.pop();
//                }
//            }
        }
       return st.isEmpty();
    }
}
