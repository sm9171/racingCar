package domain;

import java.util.Random;

import static common.RacingCarConstants.FORWARD_NUM;
import static common.RacingCarConstants.MAX_BOUND;

public class RandomMovingStrategy implements MovingStrategy {

	@Override
	public boolean movable() {
		return getRandomNumber() >= FORWARD_NUM;
	}

	private static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(MAX_BOUND);
	}
}
