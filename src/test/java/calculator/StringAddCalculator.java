package calculator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringAddCalculator {
    private static final String CUSTOM_SPLIT_REGEX = "//(.)\n(.*)";
    private static final String DEFAULT_SPLIT_REGEX = "[,:]";

    public static int splitAndSum(String input) {
        return sum(split(input));
    }

    private static List<StringAsInteger> split(String input) {
        if (isEmptyOrNull(input)) {
            return Collections.emptyList();
        }
        Matcher m = Pattern.compile(CUSTOM_SPLIT_REGEX).matcher(input);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return parse(m.group(2).split(customDelimiter));
        }
        return parse(input.split(DEFAULT_SPLIT_REGEX));
    }

    private static boolean isEmptyOrNull(String input) {
        return input == null || input.isEmpty();
    }


    private static List<StringAsInteger> parse(String[] splits) {
        return Arrays.stream(splits)
                .map(StringAsInteger::new)
                .collect(Collectors.toList());
    }

    private static int sum(List<StringAsInteger> strings) {
        return strings.stream()
                .map(StringAsInteger::intValue)
                .collect(Collectors.toList())
                .stream().reduce(0, Integer::sum);
    }
}
