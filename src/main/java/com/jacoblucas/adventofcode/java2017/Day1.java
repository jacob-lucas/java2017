package com.jacoblucas.adventofcode.java2017;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// http://adventofcode.com/2017/day/1
public class Day1 {

    // find the sum of all digits that match the next digit in the list.
    // the list is circular, so the digit after the last digit is the first digit in the list.
    int matchingDigitSum(String input, int nextPos) {
        if (input.length() == 0) {
            return 0;
        }

        List<Integer> ints = new ArrayList<Integer>();
        for (char c : input.toCharArray()) {
            ints.add(Integer.valueOf(""+c));
        }

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int next = (i + nextPos) % input.length();

            int a = ints.get(i);
            int b = ints.get(next);
            if (a == b) {
                sum += a;
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        String input = InputReader
                .read("day1.txt")
                .get(0);

        System.out.println(new Day1().matchingDigitSum(input, 1));
        System.out.println(new Day1().matchingDigitSum(input, input.length() / 2));
    }

}
