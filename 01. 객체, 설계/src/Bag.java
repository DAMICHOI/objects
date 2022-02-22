public class Bag {

	private Long amount;
	private Invitation invitation;
	private Ticket ticket;

	/**
	 * 이벤트에 당첨되지 않은 관람객의 가방 안에는 초대장이 들어있지 않을 것이다.
	 * 초대장 없이 현금만 보관한다.
	 * @param amount 현금
	 */
	public Bag(Long amount) {
		this(null, amount);
	}

	/**
	 * 이벤트에 당첨된 관람객의 가방 안에는 초대장과 현금이 들어있을 것이다.
	 * 초대장과 현금을 함께 보관한다.
	 * @param invitation 초대장
	 * @param amount 현금
	 */
	public Bag(Invitation invitation, Long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}

	/**
	 * 초대장의 보유 여부를 판단한다.
	 * @return 초대장 보유 여부(보유 시 true)
	 */
	public boolean hasInvitation() {
		return invitation != null;
	}

	/**
	 * 티켓의 보유 여부를 판단한다.
	 * @return 티켓 보유 여부(보유 시 true)
	 */
	public boolean hasTicket() {
		return ticket != null;
	}

	/**
	 * 초대장을 티켓으로 교환한다.
	 * @param ticket 티켓
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	/**
	 * 현금을 증가시킨다.
	 * @param amount 현금
	 */
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}

	/**
	 * 현금을 감소시킨다.
	 * @param amount 현금
	 */
	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}
