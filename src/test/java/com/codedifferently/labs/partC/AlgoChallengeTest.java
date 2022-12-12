package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoChallengeTest {
    @Test
    public void avengersAssembleTest01(){
        // Given
        Boolean dcHero = false;
        Boolean avengerHero = false;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avengersAssembleTest02(){
        // Given
        Boolean dcHero = false;
        Boolean avengerHero = true;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avengersAssembleTest03(){
        // Given
        Boolean dcHero = true;
        Boolean avengerHero = false;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avengersAssembleTest04(){
        // Given
        Boolean dcHero = true;
        Boolean avengerHero = true;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    // AlgoChallenge 03 Test
    @Test
    public void nearHundredTest01(){
        // Given
        int amount = 93;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.nearValue(amount);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nearHundredTest02(){
        // Given
        int amount = 90;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.nearValue(amount);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nearHundredTest03(){
        // Given
        int amount = 89;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.nearValue(amount);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
