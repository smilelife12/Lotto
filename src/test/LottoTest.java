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
    @Test
    public void lottoNumSmallerThanFourtyFive(){
        int [] numbers = lotto.getNum();
        for(int num: numbers)
            assertTrue(num<=45);
    }
    @Test
    public void lottoNumberisNotDuplicated(){
        int [] numbers = lotto.getNum();
        for(int i = 0 ; i<numbers.length-1;i++){
            for (int j = i+1; j<numbers.length;j++)
                assertTrue(numbers[i]!=numbers[j]);
        }
    }
}
