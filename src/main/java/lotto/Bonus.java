package lotto;

/**
 * Created by YoungMan on 2019-04-12.
 */

public class Bonus {

	private final int MAX_NUMBER = 45;
	private Lotto lotto;
	private int number;

	public Bonus(Lotto lotto) {
		this.lotto = lotto;
		generateBonus();
	}

	public int getBonusNum() {
		return number;
	}

	private void generateBonus() {
		while (true) {
			number = getRandomNum();
			if(notContainsNumberAtLotto()) {
				break;
			}
		}
	}

	private int getRandomNum() {
		return (int) (Math.random() * MAX_NUMBER + 1);
	}

	private boolean notContainsNumberAtLotto() {
		return !lotto.getLottoNumbers().contains(number);
	}

}
