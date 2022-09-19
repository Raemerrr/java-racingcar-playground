package ui;

import domain.CarDto;
import domain.CarNameDto;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    public static void printCars(final List<CarDto> result) {
        result.forEach(car -> System.out.println(car.getName() + " : " + parseCharacter(car.getPosition())));
        System.out.println();
    }

    public static void printWinners(final List<CarNameDto> winners) {
        List<String> winnerNames = winners.stream()
                .map(CarNameDto::getName)
                .collect(Collectors.toList());
        System.out.println(String.join(", ", winnerNames) + "가 최종 우승했습니다.");
    }

    private static String parseCharacter(final int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
