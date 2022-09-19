package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Cars {
    private static final MovementStrategy strategy = new RandomMovementStrategy();

    private final List<Car> cars;

    public Cars(final String carNames) {
        this.cars = initCars(carNames);
    }

    public void race() {
        cars.forEach(car -> car.move(strategy));
    }

    public List<CarDto> getCars() {
        return cars.stream()
                .map(CarDto::new)
                .collect(Collectors.toList());
    }

    public List<CarNameDto> getWinners() {
        return cars.stream()
                .collect(Collectors.groupingBy(
                        car -> car.getPosition().getValue(),
                        TreeMap::new,
                        Collectors.toCollection(ArrayList::new)
                ))
                .lastEntry()
                .getValue().stream()
                .map(car -> new CarNameDto(car.getName()))
                .collect(Collectors.toList());
    }

    private List<Car> initCars(final String carNames) {
        return Arrays.stream(carNames.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
