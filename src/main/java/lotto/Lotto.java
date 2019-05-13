package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by YoungMan on 2019-05-13.
 */

public class Lotto {

	private final int MAX_NUMBER = 45;
	private final int LOTTO_SIZE = 6;
	private List<Integer> lottoNumbers = new ArrayList<>();

	public Lotto() {
		lottoNumbers = extractNumber();
	}

	public List<Integer> extractNumber() {
		while (lottoNumbers.size() < LOTTO_SIZE) {

			int number = (int) (Math.random() * MAX_NUMBER + 1);
			if(isContainsNumber(number)) {
				continue;
			}
			lottoNumbers.add(number);
		}
		orderLottoNumbers();
		return lottoNumbers;
	}

	private boolean isContainsNumber(int number) {
		return lottoNumbers.contains(number) ? true : false;
	}

	public List<Integer> getLottoNumbers() {
		return lottoNumbers;
	}

	private void orderLottoNumbers() {
		Collections.sort(lottoNumbers);
	}

	@Override
	public String toString() {
		return "Lotto{" +
				"lottoNumbers=" + lottoNumbers +
				'}';
	}
}
