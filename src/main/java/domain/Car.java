package domain;

import lombok.Builder;

public class Car {
    String name;
    Position position;

    @Builder
    public Car(String name, Position position) {
        this.name = name;
        this.position = position;
    }
}
