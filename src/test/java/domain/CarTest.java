package domain;

import exception.BaseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Car 테스트")
class CarTest {

	@Test
	void createCar() {
		Position position = Position.createPosition(0);
		Car car = Car.createCar("A자동차", position);

		assertThat(car.getName()).isEqualTo("A자동차");
	}

	@Test
	void createCarOverNameLengthFive() {
		Position position = Position.createPosition(0);
		Assertions.assertThrows(
				Car.createCar("6글자자동차", position), BaseException.class
		);
	}
}