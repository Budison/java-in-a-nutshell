package com.github.budison.streams;

import java.util.stream.Stream;

/**
 * @author Kevin Nowak
 */
class Demo {
    public static void main(String[] args) {

        String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle", "john"};

        // Display the first four names sorted
        Stream.of(names)
                .limit(4)
                .sorted()
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // Skip four names and display the rest sorted ignore case
        Stream.of(names)
                .skip(4)
                .sorted((name1, name2) -> name1.compareToIgnoreCase(name2))
                .forEach(name -> System.out.print(name + " "));

        Stream.of(names)
                .skip(4)
                .sorted(String::compareToIgnoreCase)    // with method reference
                .forEach(name -> System.out.print(name + " "));

        System.out.printf("%sLargest string with length > 4: %s%n", System.lineSeparator(), Stream.of(names)
                .filter(name -> name.length() > 4)
                .max(String::compareTo)
                .get());
    }
}
