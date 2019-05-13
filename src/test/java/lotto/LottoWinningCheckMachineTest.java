package lotto;

import static org.mockito.Mockito.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by YoungMan on 2019-05-13.
 */

public class LottoWinningCheckMachineTest {

	private LottoTicket lottoTicket = mock(LottoTicket.class);
	private Lotto winningLotto = mock(Lotto.class);


	/*@Test
	public void checkWin() throws Exception{

		//Stub

		LottoWinningCheckMachine lottoWinningCheckMachine = new LottoWinningCheckMachine(lottoTicket, winningLotto, 7);
		List<LottoResult> lottoResults = lottoWinningCheckMachine.getResult();

		assertThat(lottoResults, is(lottoTicket.getLottos().size()));
	}*/

}
