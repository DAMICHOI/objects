import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * 상영 시작 시간이 특정한 기간 안에 포함되는지 여부를 판단해 할인 여부를 결정한다.
 */
public class PeriodCondition implements DiscountCondition {
	/**
	 * 요일
	 */
	private DayOfWeek dayOfWeek;
	/**
	 * 시작 시간
	 */
	private LocalTime startTime;
	/**
	 * 종료 시간
	 */
	private LocalTime endTime;

	public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	/**
	 * 할인 가능 여부를 판단한다.
	 * @param screening 상영 요일
	 * @return dayOfWeek와 같고 상영 시작 시간이 startTime과 endTime 사이에 있을 경우 true 반환,
	 * 그렇지 않은 경우에는 false 반환
	 */
	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
			startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
			endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
	}
}
