package domain;

import java.util.List;

public class RacingGame {
    private final Cars cars;
    private int tryCount;

    public RacingGame(final String carNames, final int tryCount) {
        this.cars = new Cars(carNames);
        this.tryCount = tryCount;
    }

    public void race() {
        cars.race();
        this.tryCount--;
    }

    public List<CarDto> getResult() {
        return cars.getCars();
    }

    public List<CarNameDto> getWinners() {
        return cars.getWinners();
    }

    public boolean isInProcess() {
        return 0 < this.tryCount;
    }
}
