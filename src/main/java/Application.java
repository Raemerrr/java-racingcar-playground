import domain.RacingGame;
import ui.InputView;
import ui.ResultView;

public class Application {
    public static void main(String[] args) {
        String carNames = InputView.getCarNames();
        int tryCount = InputView.getTryCount();
        RacingGame racingGame = new RacingGame(carNames, tryCount);
        while (racingGame.isInProcess()) {
            racingGame.race();
            ResultView.printCars(racingGame.getResult());
        }
        ResultView.printWinners(racingGame.getWinners());
    }
}
