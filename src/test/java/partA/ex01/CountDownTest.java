package partA.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountDownTest {

    @Test
    public void countDownLoopTest01(){
        String expected = "5 4 3 2 1 0 ";
        String actual = Countdown.countDownLoop();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countUpLoopTest01(){
        String expected = "0 1 2 3 4 5 ";
        String actual = Countdown.countUpLoop();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void evenNumberTest01(){
        String expected = "0 2 4 6 8 10 12 14 16 18 20";
        String actual = Countdown.evenNumbers();
        Assertions.assertEquals(expected, actual);
    }


}
