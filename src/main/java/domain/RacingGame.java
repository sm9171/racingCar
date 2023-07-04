package domain;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars = new ArrayList<>();

    public RacingGame(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public static RacingGame participateCars(List<Car> cars) {
        return new RacingGame(cars);
    }
}
