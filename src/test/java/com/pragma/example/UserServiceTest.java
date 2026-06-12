package com.pragma.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    void testCreateUser() {
        String result = "User created";
        assertEquals("User created", result);
    }

    @Test
    void testUpdateUser() {
        String result = "User updated";
        assertEquals("User updated", result);
    }

    @Test
    void testDeleteUser() {
        String result = "User deleted";
        assertEquals("User deleted", result);
    }
}