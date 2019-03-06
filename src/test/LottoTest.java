//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package test;

import main.Lotto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LottoTest {
    Lotto lotto = new Lotto();

    @Test
    public void pressQReturnsTrue() {
        Assertions.assertTrue(this.lotto.isStop("q"));
        Assertions.assertTrue(this.lotto.isStop("Q"));
        Assertions.assertTrue(!this.lotto.isStop("R"));
    }

    @Test
    public void pressSReturnsTrue() {
        Assertions.assertTrue(this.lotto.isContinue("S"));
        Assertions.assertTrue(this.lotto.isContinue("s"));
        Assertions.assertTrue(!this.lotto.isContinue("F"));
    }

    @Test
    public void lottoHaveSixNumbers() {

        Assertions.assertEquals(6, this.lotto.getNum().length);
    }

    @Test
    public void lottoNumBiggerThanOne() {
        int[] numbers = this.lotto.getNum();

        for (int i = 0; i < numbers.length; i++) {
            Assertions.assertTrue(numbers[i] >= 1);
        }
    }

    @Test
    public void lottoNumSmallerThanFortyFive() {
        int[] numbers = this.lotto.getNum();

        for (int i = 0; i < numbers.length; i++) {
            Assertions.assertTrue(numbers[i] <= 45);
        }
    }

    @Test
    public void lottoNumberIsNotDuplicated() {
        int[] numbers = this.lotto.getNum();

        for(int i = 0; i < numbers.length - 1; ++i) {
            for(int j = i + 1; j < numbers.length; ++j) {
                Assertions.assertTrue(numbers[i] != numbers[j]);
            }
        }

    }
}
