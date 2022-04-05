import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 할인 정책
 */
public abstract class DiscountPolicy {
	private List<DiscountCondition> conditions;

	public DiscountPolicy(DiscountCondition... conditions) {
		this.conditions = Arrays.asList(conditions);
	}

	public Money calculateDiscountAmount(Screening screening) {
		for (DiscountCondition each : conditions) {
			if (each.isSatisfiedBy(screening)) {
				return getDiscountAmount(screening);
			}
		}

		return Money.ZERO;
	}

	protected abstract Money getDiscountAmount(Screening screening);
}
