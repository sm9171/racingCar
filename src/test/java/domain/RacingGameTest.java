package domain;

import common.ConvertUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("RacingGame 테스트")
class RacingGameTest {

	@Test
	void participateCars() {
		String carNames = "멋쟁이,소크라테스,타요버스";
		List<Car> cars = new ArrayList<>();

		String[] splittedCarNames = ConvertUtils.convertStringToArr(carNames);
		for (String splittedCarName : splittedCarNames) {
			cars.add(Car.createCar(splittedCarName));
		}
		RacingGame racingGame = RacingGame.participateCars(cars);

		Assertions.assertThat(racingGame.getCars().get(0).getName()).isEqualTo("멋쟁이");
		Assertions.assertThat(racingGame.getCars().get(1).getName()).isEqualTo("소크라테스");
		Assertions.assertThat(racingGame.getCars().get(2).getName()).isEqualTo("타요버스");
	}
}