package lotto;

/**
 * Created by YoungMan on 2019-04-10.
 */

public enum Rank {

	RANK1("1등", "20000000원", 6),
	RANK2("2등", "10000000원", 5),
	RANK3("3등", "5000000원", 5),
	RANK4("4등", "2000000원", 4),
	RANK5("5등", "1000000원", 3),
	FAIL("탈락", "", 0);

	private static final int WINNING_MIN_COUNT = 3;

	private String explain;
	private String winningMoney;
	private long winningCount;

	Rank(String explain, String winningMoney, long winningCount) {
		this.explain = explain;
		this.winningMoney = winningMoney;
		this.winningCount = winningCount;
	}

	public static Rank valueOf(long winningCount, boolean winningBonus) {

		if (winningCount < WINNING_MIN_COUNT) {
			return FAIL;
		}

		if (RANK2.winningCount == winningCount && winningBonus) {
			return RANK2;
		}

		for (Rank rank : values()) {
			if (rank.winningCount == winningCount)
				return rank;
		}
		throw new IllegalArgumentException("오류입니다.");
	}
}