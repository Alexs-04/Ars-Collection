package com.korebit.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class OtherTest {
    @Test
    public void arrayTest() {
        int[] arrayOne = {1, 2, 3, 4, 5};
        int[] arrayTwo = {1, 2, 3, 4, 5};

        // assert arrayOne.length == arrayTwo.length;
        assertArrayEquals(arrayOne, arrayTwo);
    }

    @Test
    public void timeTest() {
        assertTimeout(java.time.Duration.ofSeconds(1), () -> {
            Thread.sleep(500);
        });
    }
}
