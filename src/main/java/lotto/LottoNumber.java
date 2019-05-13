package lotto;

import java.util.Set;

/**
 * Created by YoungMan on 2019-04-15.
 */

public class LottoNumber {

	private final int MAX = 45;
	private final int MIN = 1;
	private int lottoNumber;

	public LottoNumber(int lottoNumber) {
		checkLottoRange(lottoNumber);
		this.lottoNumber = lottoNumber;
	}

	private void checkLottoRange(int lottoNumber) {
		if (lottoNumber > MAX || lottoNumber < MIN)
			throw new IllegalArgumentException("잘못된 번호입니다.");
	}

}
