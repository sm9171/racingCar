package domain;

import lombok.Builder;

public class Position {
    private Integer distance;

    public Position(Integer distance) {
        this.distance = distance;
    }
    public Integer getDistance() {
        return distance;
    }

	public static Position createPosition(Integer distance) {
		return new Position(distance);
	}
}
