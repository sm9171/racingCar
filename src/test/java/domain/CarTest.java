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
		Car car = Car.createCar("A자동차");
		assertThat(car.getName()).isEqualTo("A자동차");
	}

	@Test
	void createCarOverNameLengthFive() {
		Assertions.assertThrows(
				Car.createCar("6글자자동차"), BaseException.class
		);
	}
}