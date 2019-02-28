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

    public LottoTest() {
    }

    @Test
    public void pressQreturnTrue() {
        Assertions.assertTrue(this.lotto.isStop("q"));
        Assertions.assertTrue(this.lotto.isStop("Q"));
        Assertions.assertTrue(!this.lotto.isStop("R"));
    }

    @Test
    public void pressSreturnTrue() {
        Assertions.assertTrue(this.lotto.isRight("S"));
        Assertions.assertTrue(this.lotto.isRight("s"));
        Assertions.assertTrue(!this.lotto.isRight("F"));
    }

    @Test
    public void lottoHaveSixnumbers() {
        Assertions.assertEquals(6, this.lotto.getNum().length);
    }

    @Test
    public void lottoNumBiggerthanOne() {
        int[] numbers = this.lotto.getNum();
        int[] var2 = numbers;
        int var3 = numbers.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            Assertions.assertTrue(num >= 1);
        }

    }

    @Test
    public void lottoNumSmallerThanFourtyFive() {
        int[] numbers = this.lotto.getNum();
        int[] var2 = numbers;
        int var3 = numbers.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            Assertions.assertTrue(num <= 45);
        }

    }

    @Test
    public void lottoNumberisNotDuplicated() {
        int[] numbers = this.lotto.getNum();

        for(int i = 0; i < numbers.length - 1; ++i) {
            for(int j = i + 1; j < numbers.length; ++j) {
                Assertions.assertTrue(numbers[i] != numbers[j]);
            }
        }

    }
}
