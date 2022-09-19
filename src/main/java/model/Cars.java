package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String input) {
        cars = parseCar(input);
    }

    private List<Car> parseCar(String input) {
        return Arrays.stream(input.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
