package ui;

import model.PlayResult;
import model.Positive;

public class ResultView {

    public static void play(PlayResult result) {
        System.out.println(result.getCarName().getCarName() + " : " + parseDistance(result.getDistance()));
    }

    private static String parseDistance(Positive distance) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < distance.intValue(); i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
