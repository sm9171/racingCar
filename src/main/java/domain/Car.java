package domain;

import exception.BaseException;
import exception.ResponseMessage;

public class Car {
    private String name;
    private Position position;

    public Car(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public static Car createCar(String name, Position position) {
        validateCarName(name);
        return new Car(name, position);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    private static void validateCarName(String name) {
        if (name.length() > 5) {
            throw new BaseException(ResponseMessage.CAR_NAME_LENGTH_OVER_FIVE);
        }
    }
}
