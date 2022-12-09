package partB.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountByTensTest {
    @Test
    public void countByTensTest01(){
        String expected = "10 20 30 40 50 60 70 80 90 100 ";
        String actual = CountByTens.countingByTens();
        Assertions.assertEquals(expected, actual);
    }
}
