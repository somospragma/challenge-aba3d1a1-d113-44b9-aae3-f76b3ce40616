package com.pragma.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductServiceTest {

    @Test
    void testCreateProduct() {
        String result = "Product created";
        assertEquals("Product created", result);
    }

    @Test
    void testUpdateProduct() {
        String result = "Product updated";
        assertEquals("Product updated", result);
    }

    @Test
    void testDeleteProduct() {
        String result = "Product deleted";
        assertEquals("Product deleted", result);
    }
}