package com.testing.mutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoServiceTest {

    @Test
    public void testPositive() {
        DemoService obj = new DemoService();
        assertTrue(obj.isPositive(10));
        assertFalse(obj.isPositive(-1));
        assertFalse(obj.isPositive(0));
    }

    @Test
    public void whenPalindrom_thenAccept() {
        DemoService palindromeTester = new DemoService();
        assertTrue(palindromeTester.isPalindrome("noon"));
        assertFalse(palindromeTester.isPalindrome("morning"));
    }
}