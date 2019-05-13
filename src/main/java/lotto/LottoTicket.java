package lotto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YoungMan on 2019-05-13.
 */

public class LottoTicket {

	private final int PRICE_PER_SHEET = 1000;
	private List<Lotto> lottos = new ArrayList<>();
	private int money;

	public LottoTicket(int money) {
		this.money = money;
		publicLottoTicketByMoney();
	}

	public List<Lotto> publicLottoTicketByMoney() {

		/*lottos =  lottos.stream()
				.map(index -> new Lotto())
				.limit(getLottoCount(money))
				.collect(Collectors.toList())
				;*/

		for(int i = 0; i<getLottoCount(); i++) {
			lottos.add(new Lotto());
		}
		return lottos;
	}

	private int getLottoCount() {
		if (isRemainMoney()) {
			throw new RuntimeException("잘못된 지급액입니다");
		}
		return getQuotient();
	}

	private boolean isRemainMoney() {
		return money % PRICE_PER_SHEET != 0 ? true : false;
	}

	private int getQuotient() {
		return money / PRICE_PER_SHEET;
	}

	public List<Lotto> getLottos() {
		return lottos;
	}
}
