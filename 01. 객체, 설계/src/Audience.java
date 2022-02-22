/**
 * 관람객
 * 관람객은 소지품을 보관하기 위해 가방을 소지할 수 있다.
 */
public class Audience {
	private Bag bag;

	public Audience(Bag bag) {
		this.bag = bag;
	}

	/**
	 * 티켓을 가방에 넣은 후 지불된 금액을 반환한다.
	 * @param ticket 티켓
	 * @return 지불된 금액
	 */
	public Long buy(Ticket ticket) {
		if (bag.hasInvitation()) {
			bag.setTicket(ticket);
			return 0L;
		} else {
			bag.setTicket(ticket);
			bag.minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}
}
