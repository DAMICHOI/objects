import java.time.Duration;

public class Movie {
	/**
	 * 제목
	 */
	private String title;
	/**
	 * 상영시간
	 */
	private Duration runningTime;
	/**
	 * 기본 요금
	 */
	private Money fee;
	/**
	 * 할인 정책
	 */
	private DiscountPolicy discountPolicy;

	public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
		this.title = title;
		this.runningTime = runningTime;
		this.fee = fee;
		this.discountPolicy = discountPolicy;
	}

	public Money getFee() {
		return fee;
	}

	/**
	 * 할인 요금을 계산한다.
	 * @param screening 상영 정보
	 * @return 차감된 할인 요금
	 */
	public Money calculateMovieFee(Screening screening) {
		// 할인 정책이 없으면 기본 금액을 반환한다.
		if (discountPolicy == null) {
			return fee;
		}
		return fee.minus(discountPolicy.calculateDiscountAmount(screening));
	}
}
