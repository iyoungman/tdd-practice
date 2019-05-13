package lotto;

import org.junit.Test;

import java.util.List;
import java.util.Scanner;

/**
 * Created by YoungMan on 2019-05-13.
 */

public class IntegrationTest {

	@Test
	public void integration() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("구입금액을 입력해 주세요.");
		int money = scanner.nextInt();
		LottoTicket lottoTicket = new LottoTicket(money);

		System.out.println("지난주 당첨 번호를 입력해주세요.");
		Lotto winningLotto = new Lotto();
		System.out.println(winningLotto.getLottoNumbers());

		System.out.println("보너스 볼을 입력해 주세요.");
		Bonus bonus = new Bonus(winningLotto);
		System.out.println(bonus.getBonusNum());

		LottoWinningCheckMachine lottoCheckMachine = new LottoWinningCheckMachine(lottoTicket, winningLotto, bonus);
		List<LottoResult> lottoResults = lottoCheckMachine.getResult();
		System.out.println(lottoResults);
	}
}
