/**
 * 소극장
 */
public class Theater {
	private TicketSeller ticketSeller;

	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}

	/**
	 * 관람객을 입장시킨다.
	 * @param audience 관람객
	 */
	public void enter(Audience audience) {
		ticketSeller.sellTo(audience);
	}
}
