package model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomGenerator {
    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 9;
    private static final List<Integer> numbers = IntStream.rangeClosed(MIN_NUM, MAX_NUM)
            .boxed()
            .collect(Collectors.toList());

    public static int generate() {
        Collections.shuffle(numbers);
        return numbers.get(0);
    }
}
