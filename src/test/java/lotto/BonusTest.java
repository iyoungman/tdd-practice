package lotto;

import org.junit.Test;

import java.util.Arrays;

import static org.mockito.Mockito.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by YoungMan on 2019-05-13.
 */

public class BonusTest {

	private Lotto lotto = mock(Lotto.class);

	@Test
	public void checkNumber() throws Exception {

		//Stub
		when(lotto.getLottoNumbers()).thenReturn(
				Arrays.asList(
						1, 2, 5, 10, 12, 15
				)
		);

		Bonus bonus = new Bonus(lotto);
		boolean isContain = lotto.getLottoNumbers().contains(
				bonus.getBonusNum()
		);

		assertThat(isContain, is(false));
	}
}
