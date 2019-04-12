package lotto;

/**
 * Created by YoungMan on 2019-04-10.
 */

public class RankExtractor {

	private Lotto weekLotto;
	private Lotto customerLotto;

	public RankExtractor(Lotto weekLotto, Lotto customerLotto) {
		this.weekLotto = weekLotto;
		this.customerLotto = customerLotto;
	}

	public Rank extractRank() {
		return Rank.valueOf(extractCount(), extractBonus());
	}

	private long extractCount() {
		return weekLotto.getLotto().stream()
				.filter(number -> customerLotto.getLotto().contains(number))
				.count();
	}

	private boolean extractBonus() {
		return customerLotto.getLotto().contains(weekLotto.getBonusNum());
	}
}
