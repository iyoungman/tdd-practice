package lotto;

/**
 * Created by YoungMan on 2019-05-13.
 */

public class LottoResult {

	int winningCount;
	boolean bonus;
	Rank rank;

	public LottoResult(int winningCount, boolean bonus) {
		this.winningCount = winningCount;
		this.bonus = bonus;
		rank = Rank.valueOf(winningCount, bonus);
	}

	@Override
	public String toString() {
		return "LottoResult{" +
				"winningCount=" + winningCount +
				", bonus=" + bonus +
				", explain=" + rank.getExplain() +
				", money=" + rank.getWinningMoney() +
				'}';
	}
}
