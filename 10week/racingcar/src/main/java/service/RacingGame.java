package service;

import domain.Cars;
import domain.Number;
import utils.RacingGameStatusView;

public class RacingGame {
    private static final int START_NUMBER = 0;
    private static final int FINISH_NUMBER = 10;

    private RacingGame() {};

    public static void start() {
        Cars cars = RacingGameController.createCar();
        Number count = RacingGameController.createCount();
        int times = count.getCount();
        while (times-- > 0) {
            cars.moveCars(START_NUMBER, FINISH_NUMBER);
            RacingGameStatusView.carStatusView(cars);
            RacingGameStatusView.spacingWord();
        }
        RacingGameStatusView.resultView(cars.getWinner());
    }
}
