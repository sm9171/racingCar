package domain;

import exception.BaseException;
import exception.ResponseMessage;

import java.util.Random;

import static common.RacingCarConstants.*;

public class Car {
    private String name;
    private Position position;

    public Car(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public static Car createCar(String name) {
        validateCarName(name);
        return new Car(name, new Position(0));
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    private static void validateCarName(String name) {
        if (name.length() == 0) {
            throw new BaseException(ResponseMessage.CAR_NAME_LENGTH_ZERO);
        }

        if (name.length() > CAR_NAME_LENGTH_LIMIT) {
            throw new BaseException(ResponseMessage.CAR_NAME_LENGTH_OVER_FIVE);
        }
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.movable()) {
            position.plusDistance();
        }
    }
}
