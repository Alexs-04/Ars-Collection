package com.korebit.exception;

import com.korebit.logic.UtilKKt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {
    @Test
    public void testException() {
        var number = UtilKKt.getRandomNumber(-1, 10);
        var exception = assertThrows(ArithmeticException.class, () -> selectorException(number));

        assertEquals("Number is -1", exception.getMessage());
    }

    private void selectorException(int number) {
        switch (number) {
            case -1 -> throw new ArithmeticException("Number is -1");
            case 0 -> throw new NullPointerException("Number is 0");
            case 1 -> throw new IllegalArgumentException("Number is 1");
            default -> throw new RuntimeException("Error");
        }
    }
}
