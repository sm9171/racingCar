package domain;

import exception.BaseException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Car 테스트")
class CarTest {

	@Test
	void createCar() {
		Car car = Car.createCar("A자동차");
		assertThat(car.getName()).isEqualTo("A자동차");
	}

	@Test
	void createCarWithOverNameLengthFive() {
		Throwable exception = assertThrows(BaseException.class, () -> {
			Car.createCar("6글자자동차");
		});
		assertEquals("차 이름이 5글자가 넘습니다.", exception.getMessage());
	}

	@Test
	void createCarWithEmptyName() {
		Throwable exception = assertThrows(BaseException.class, () -> {
			Car.createCar("");
		});
		assertEquals("차 이름에 빈값이 들어갈 수 없습니다.", exception.getMessage());
	}

	@Test
	void moveCar() {
		Car car = Car.createCar("A자동차");
		car.move(() -> true);
		assertThat(car.getPosition().getDistance()).isEqualTo(1);
	}

	@Test
	void notMoveCar() {
		Car car = Car.createCar("A자동차");
		car.move(() -> false);
		assertThat(car.getPosition().getDistance()).isEqualTo(0);
	}
}