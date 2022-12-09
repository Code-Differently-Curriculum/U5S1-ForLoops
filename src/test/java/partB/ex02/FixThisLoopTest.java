package partB.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex02.FixThisLoop;

public class FixThisLoopTest {
    @Test
    public void helloTest01(){
        String expected = "Hello\n" +
                "Hello\n" +
                "Hello\n" +
                "Hello\n" +
                "Hello\n";
        String actual = FixThisLoop.hello();
        Assertions.assertEquals(expected, actual);
    }
}
