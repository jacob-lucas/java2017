package com.jacoblucas.adventofcode.java2017;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Day1Test {

    @Test
    public void testMatchingDigitSum() {
        List<TestInput<String, Integer>> inputs = Arrays.asList(
                new TestInput<String, Integer>("4", 4),
                new TestInput<String, Integer>("1122", 3),
                new TestInput<String, Integer>("1111", 4),
                new TestInput<String, Integer>("1234", 0),
                new TestInput<String, Integer>("91212129", 9)
        );

        Day1 day1 = new Day1();
        for (TestInput<String, Integer> input : inputs) {
            System.out.println(input);
            int sum = day1.matchingDigitSum(input.input, 1);
            assertThat(sum, is(input.output));
        }
    }

    @Test
    public void testMatchingDigitSumHalfWayAround() {
        List<TestInput<String, Integer>> inputs = Arrays.asList(
                new TestInput<String, Integer>("1212", 6),
                new TestInput<String, Integer>("1221", 0),
                new TestInput<String, Integer>("123425", 4),
                new TestInput<String, Integer>("123123", 12),
                new TestInput<String, Integer>("12131415", 4)
        );

        Day1 day1 = new Day1();
        for (TestInput<String, Integer> input : inputs) {
            System.out.println(input);
            int sum = day1.matchingDigitSum(input.input, input.input.length() / 2);
            assertThat(sum, is(input.output));
        }
    }

}
