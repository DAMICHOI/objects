import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 매표소
 */
public class TicketOffice {
	private Long amount;
	private List<Ticket> tickets = new ArrayList<>();

	public TicketOffice(Long amount, Ticket... tickets) {
		this.amount = amount;
		this.tickets.addAll(Arrays.asList(tickets));
	}

	/**
	 * tickets 컬렉션에서 맨 첫 번째 위치에 저장된 Ticket 을 반환한다.
	 * @return Ticket
	 */
	public Ticket getTicket() {
		return tickets.remove(0);
	}

	/**
	 * 판매 금액을 차감한다.
	 * @param amount 차감할 판매 금액
	 */
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}

	/**
	 * 판매 금액을 더한다.
	 * @param amount 더할 판매 금액
	 */
	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}
