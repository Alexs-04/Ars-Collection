package com.korebit.entity.store;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestShop {

    @Test
    public void testTotalPrice() {
        var carShop = new CarShop(List.of(
                new Product("Car A", 10000.0),
                new Product("Car B", 15000.0),
                new Product("Car C", 20000.0)
        ));

        assertNotNull(carShop);
        assertEquals(454676D,carShop.getTotalPrice());
    }
}
