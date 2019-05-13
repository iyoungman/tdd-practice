package lotto;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by YoungMan on 2019-05-13.
 */

public class LottoTicketTest {

	private LottoTicket lottoTicket;

	/*@Before
	public void setUp() {
		lottoTicket = new LottoTicket();
	}*/

	@Test
	public void publicLottoTicketByMoney_정상금액() {
		int money = 5000;
		LottoTicket lottoTicket = new LottoTicket(money);

		assertThat(lottoTicket.getLottos().size(), is(5));
	}

	@Test(expected = RuntimeException.class)
	public void publicLottoTicketByMoney_잘못된금액() {
		int money = 4500;
		LottoTicket lottoTicket = new LottoTicket(money);
	}
}
