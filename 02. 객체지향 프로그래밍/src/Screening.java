import java.time.LocalDateTime;

/**
 * 사용자들이 예매하는 대상인 '상영'
 */
public class Screening {
	/**
	 * 상영할 영화
	 */
	private Movie movie;
	/**
	 * 순번
	 */
	private int sequence;
	/**
	 * 상영 시작 시간
	 */
	private LocalDateTime whenScreened;

	public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}

	/**
	 * 상영 시작 시간을 반환한다.
	 * @return 상영 시작 시간
	 */
	public LocalDateTime getStartTime() {
		return whenScreened;
	}

	/**
	 * 순번의 일치 여부를 검사한다.
	 * @param sequence 순번
	 * @return 순번 일치 여부
	 */
	public boolean isSequence(int sequence) {
		return this.sequence == sequence;
	}

	/**
	 * 기본 요금을 반환한다.
	 * @return 기본 요금
	 */
	public Money getMovieFee() {
		return movie.getFee();
	}

	public Reservation reserve(Customer customer, int audienceCount) {
		return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
	}

	private Money calculateFee(int audienceCount) {
		return movie.calculateMovieFee(this).times(audienceCount);
	}
}
