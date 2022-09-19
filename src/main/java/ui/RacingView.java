package ui;

import model.CarName;
import model.Cars;
import model.Positive;

import java.util.List;
import java.util.stream.Collectors;

public class RacingView {
    private static final int MIN_SPEED = 4;
    private static Cars cars;
    private static Positive gameCount;

    public static void run() {
        input();
        play();
        printWinner();
    }

    private static void input() {
        cars = new Cars(InputView.carName());
        gameCount = InputView.gameCount();
    }

    private static void play() {
        System.out.println("\n실행 결과");
        for (int i = 0; i < gameCount.intValue(); i++) {
            cars.play((Integer speed) -> MIN_SPEED < speed);
            System.out.println();
        }
    }

    private static void printWinner() {
        List<String> winnerNames = cars.getWinner().stream()
                .map(CarName::getCarName)
                .collect(Collectors.toList());
        System.out.println(String.join(", ", winnerNames)+ "가 최종 우승했습니다.");
    }
}
