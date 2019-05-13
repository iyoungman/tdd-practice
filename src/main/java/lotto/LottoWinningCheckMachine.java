package lotto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YoungMan on 2019-05-13.
 */

public class LottoWinningCheckMachine {

	private LottoTicket lottoTicket;
	private Lotto winningLotto;
	private Bonus bonus;
	private List<LottoResult> lottoResults = new ArrayList();

	public LottoWinningCheckMachine(LottoTicket lottoTicket, Lotto winningLotto, Bonus bonus) {
		this.lottoTicket = lottoTicket;
		this.winningLotto = winningLotto;
		this.bonus = bonus;

		checkValidateNumber();
	}

	private void checkValidateNumber() {
		if(checkBonusNum(winningLotto)) {
			throw new RuntimeException("당첨번호에는 보너스 넘버가 중복될 수 없습니다");
		}
	}

	public List<LottoResult> getResult() {

		for(Lotto lotto : lottoTicket.getLottos()) {
			lottoResults.add(checkWinningResult(lotto));
		}
		return lottoResults;
	}

	private LottoResult checkWinningResult(Lotto lotto) {
		int winningCount = checkWinningNum(lotto);
		boolean winningBonus = false;
		if(winningCount == 5) {
			winningBonus = checkBonusNum(lotto);
		}
		return new LottoResult(winningCount, winningBonus);
	}

	private int checkWinningNum(Lotto lotto) {
		return (int) winningLotto.getLottoNumbers().stream()
				.filter(number -> lotto.getLottoNumbers().contains(number))
				.count();
	}

	private boolean checkBonusNum(Lotto lotto) {
		return lotto.getLottoNumbers()
				.contains(bonus.getBonusNum());
	}
}