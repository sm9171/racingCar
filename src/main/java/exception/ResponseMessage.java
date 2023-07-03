package exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseMessage {
	// Car 에러메세지
	CAR_NAME_LENGTH_OVER_FIVE("차 이름이 5글자가 넘습니다."),
	CAR_NAME_LENGTH_ZERO("차 이름에 빈값이 들어갈 수 없습니다.");
	final String message;
}
