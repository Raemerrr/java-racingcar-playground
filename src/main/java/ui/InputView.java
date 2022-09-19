package ui;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String carNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine();
    }

    public static int tryGetNumberOfLap() {
        System.out.println("시도할 회수는 몇회인가요?");
        int result;
        try {
            result = scanner.nextInt();
            validateNumberOfLap(result);
        } catch (Exception e) {
            throw new RuntimeException("잘못된 입력입니다.");
        }
        return result;
    }

    private static void validateNumberOfLap(int numberOfLap) {
        if (numberOfLap <= 0) {
            throw new IllegalArgumentException("시도할 횟수는 0보다 커야합니다.");
        }
    }
}
