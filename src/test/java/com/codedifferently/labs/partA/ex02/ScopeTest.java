package com.codedifferently.labs.partA.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScopeTest {
    @Test
    public void scopeTest01(){
        String expected = "64 32 16 8 4 2 1 \n" +
                "0 1 2 3 4 5 \n" +
                "5 4 3 2 1 0 \n" +
                "2 4 8 16 32 64 \n";
        String actual = ScopeRunner.scope();
        Assertions.assertEquals(expected, actual);
    }
}
