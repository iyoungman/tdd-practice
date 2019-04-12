package lotto;

import org.junit.Test;

/**
 * Created by YoungMan on 2019-04-10.
 */

public class RankExtractorTest {

	@Test
	public void 로또검사() {

		Lotto weekLotto = LottoGenerator.randomGenerator();
		weekLotto.printLotto();

		Lotto customerLotto = LottoGenerator.randomGenerator();
		customerLotto.printLotto();

		RankExtractor rankExtractor = new RankExtractor(weekLotto, customerLotto);
		Rank rank = rankExtractor.extractRank();
		System.out.println(rank);
	}

}
