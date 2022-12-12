package com.codedifferently.labs.partB.ex03;

import com.codedifferently.labs.partB.ex03.Challenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ChallengeTest {
    @Test
    public void challengeTest01(){
        String expected = "Kaleb\n" +
                "Tariq\n" +
                "Gio\n" +
                "Sam\n" +
                "Steph\n" +
                "Michael";
        String actual = Challenge.challenge();
        Assertions.assertEquals(expected, actual);
    }
}
