package lotto;

import java.util.Set;

/**
 * Created by YoungMan on 2019-04-10.
 */

public class Lotto {

	private final Set<Integer> lotto;
	private int bonusNum;

	public Lotto(Set<Integer> lotto, int bonusNum) {
		this.lotto = lotto;
		this.bonusNum = bonusNum;
	}

	public void printLotto() {
		lotto.stream().forEach(o-> System.out.print(o + " "));
		System.out.println("bonus:" + bonusNum);
	}

	public Set<Integer> getLotto() {
		return this.lotto;
	}

	public int getBonusNum() {
		return this.bonusNum;
	}
}
