package etc;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomGenerator {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final List<Integer> numbers = IntStream.rangeClosed(MIN_NUMBER, MAX_NUMBER).boxed().collect(Collectors.toList());

    public static Integer generate() {
        Collections.shuffle(numbers);
        return numbers.get(0);
    }
}
