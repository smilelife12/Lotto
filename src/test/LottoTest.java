package test;

import main.Lotto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LottoTest {
    Lotto lotto = new Lotto();
    @Test
    public void pressQreturnTrue(){
        assertTrue(lotto.isStop("q"));
        assertTrue(lotto.isStop("Q"));
        assertTrue(!lotto.isStop("R"));
    }
    @Test
    public void pressSreturnTrue(){
        assertTrue(lotto.isRight("S"));
        assertTrue(lotto.isRight("s"));
        assertTrue(!lotto.isRight("F"));
    }
    @Test
    public void lottoHaveSixnumbers(){
        assertEquals(6,lotto.getNum().length);
    }
    @Test
    public void lottoNumBiggerthanOne(){
        int []numbers = lotto.getNum();
        for(int num: numbers)
            assertTrue(num>=1);
    }
}
