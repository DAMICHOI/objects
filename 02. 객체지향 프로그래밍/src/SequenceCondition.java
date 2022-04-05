public class SequenceCondition implements  DiscountCondition {
	/**
	 * 순번
	 */
	private int sequence;

	public SequenceCondition(int sequence) {
		this.sequence = sequence;
	}

	/**
	 * 할인 가능 여부를 판단한다.
	 * @param screening 상영 순번
	 * @return 일치할 경우 true, 그렇지 않은 경우 false
	 */
	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return screening.isSequence(sequence);
	}
}
