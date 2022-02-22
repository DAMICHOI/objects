/**
 * 판매원
 * 판매원은 매표소에서 초대장을 티켓으로 교환해주거나 티켓을 판매하는 역할을 수행한다.
 */
public class TicketSeller {
	private TicketOffice ticketOffice;

	/**
	 * 판매원은 자신이 일하는 매표소를 알고 있어야 한다.
	 * @param ticketOffice 매표소
	 */
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	/**
	 * 티켓을 판매한다.
	 * @param audience 관람객
	 */
	public void sellTo(Audience audience) {
		ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
	}
}
