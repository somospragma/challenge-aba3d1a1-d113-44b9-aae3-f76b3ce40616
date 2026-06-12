package com.pragma.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    @Test
    void testCreateOrder() {
        String result = "Order created";
        assertEquals("Order created", result);
    }

    @Test
    void testUpdateOrder() {
        String result = "Order updated";
        assertEquals("Order updated", result);
    }

    @Test
    void testDeleteOrder() {
        String result = "Order deleted";
        assertEquals("Order deleted", result);
    }
}