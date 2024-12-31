package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack<>();
        numbers.push(31);
        numbers.push(89);
        numbers.push(18);

        System.out.println(numbers);

        System.out.println(numbers.search(31));

        numbers.pop();
        System.out.println(numbers);

    }
}