package com.github.budison.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kevin Nowak
 */
class Intro {
    public static void main(String[] args) {
        Double[] numbers = {2.4, 55.6, 90.12, 26.6};
        Set<Double> set = new HashSet<>(Arrays.asList(numbers));
        int count = 0;

        // Conservative approach
        for (double e : set) {
            if (e > 60) {
                count++;
            }
        }
        System.out.println("Count is " + count);

        // Modern approach
        System.out.println("Count is " + set.stream().filter(aDouble -> aDouble > 60).count());
    }
}
