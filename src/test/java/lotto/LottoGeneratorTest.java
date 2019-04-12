package lotto;

import org.junit.Test;

/**
 * Created by YoungMan on 2019-04-10.
 */

public class LottoGeneratorTest {

	@Test
	public void 랜덤추출() {

		Lotto lotto = LottoGenerator.randomGenerator();
		lotto.printLotto();
	}
}
