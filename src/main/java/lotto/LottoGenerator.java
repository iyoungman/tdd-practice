package lotto;

import java.util.*;

/**
 * Created by YoungMan on 2019-04-10.
 */

public class LottoGenerator {

	private static final int GENERATE_COUNT = 7;
	private static final int REGULAR_COUNT = 6;

	public static Lotto randomGenerator() {

		Set<Integer> numberSet = new LinkedHashSet<>();

		while (numberSet.size() < GENERATE_COUNT) {
			numberSet.add(
					(int) (Math.random() * 45 + 1)
			);
		}
		return convertToLotto(numberSet);
	}

	public static Lotto convertToLotto(Set<Integer> numberSet) {

		Set<Integer> regularSet = new TreeSet<>();
		int bonus = 0;

		for (int num : numberSet) {
			if (regularSet.size() == REGULAR_COUNT) {
				bonus = num;
				break;
			}
			regularSet.add(num);
		}
		return new Lotto(regularSet, bonus);
	}
}
