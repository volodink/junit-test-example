package org.example;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    public List lst;

    @BeforeAll
    public static void printMessage() {
        System.out.println("Test Message!");
    }

    @BeforeEach
    public void printEachMessage() {
        System.out.println("Test Each Case!");
        lst = new ArrayList<Integer>();
    }

    @Test
    @DisplayName("Add something")
    @RepeatedTest(100)
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void add() {
        List expectedList = new ArrayList<Integer>();
        assertEquals(lst, expectedList);
    }

}
