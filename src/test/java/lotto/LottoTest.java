package lotto;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by YoungMan on 2019-05-13.
 */

public class LottoTest {

	private Lotto lotto;

	@Before
	public void setUp() {
		lotto = new Lotto();
	}

	@Test
	public void extractNumber_랜덤추출() throws Exception{

		List<Integer> lotooNum = lotto.getLottoNumbers();

		assertThat(lotooNum.size(), is(6));
	}

}
