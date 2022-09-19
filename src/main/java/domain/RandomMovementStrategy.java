package domain;

import etc.RandomGenerator;

public class RandomMovementStrategy implements MovementStrategy {
    private static final int FORWARD_MIN_SPEED = 4;

    @Override
    public boolean isMovable() {
        return FORWARD_MIN_SPEED <= getRandomNumber();
    }

    private int getRandomNumber() {
        return RandomGenerator.generate();
    }
}
