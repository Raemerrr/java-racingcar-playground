package model;

import ui.ResultView;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String input) {
        cars = parseCar(input);
    }

    public void play(Predicate<Integer> predicate) {
        cars.forEach((car) -> {
            PlayResult result = car.play(predicate);
            ResultView.play(result);
        });
    }

    public List<CarName> getWinner() {
        return cars.stream()
                .collect(Collectors.groupingBy(
                        car -> car.getDistance().intValue(),
                        TreeMap::new,
                        Collectors.toCollection(ArrayList::new)
                ))
                .lastEntry()
                .getValue()
                .stream()
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private List<Car> parseCar(String input) {
        return Arrays.stream(input.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
