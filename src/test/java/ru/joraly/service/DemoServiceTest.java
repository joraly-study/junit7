package ru.joraly.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import ru.joraly.service.impl.DemoServiceImpl;

import java.util.concurrent.TimeUnit;

class DemoServiceTest {

    public DemoService demoService = new DemoServiceImpl();

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Testing...");
    }

    @AfterEach
    void afterTest() throws Exception {
        System.out.println("Test completed");
    }

    @Test
    @DisplayName("Найти максимальное количество И")
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void findMaxI() {
        assertEquals("ИИИ", demoService.findMaxI("ИИИ и ии иии"));
        assertEquals("иии", demoService.findMaxI("иии и ии иии"));
        assertNotEquals("и", demoService.findMaxI("и ИИИИИИ ии ИИИИИИИИИИ"));
        assertEquals("", demoService.findMaxI(""));
    }

    @Test
    @DisplayName("Найти диагональную сумму в матрице")
    void findDiagonalSum() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertEquals(15, demoService.findDiagonalSum(matrix));

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        assertEquals(34, demoService.findDiagonalSum(matrix2));
    }

    @Test
    @DisplayName("Сгенерировать акроним")
    void generateAcronym() {
        assertEquals("TDD", demoService.generateAcronym("Test Driven Development"));
        assertEquals("TDD", demoService.generateAcronym("test driven development"));
        assertEquals("", demoService.generateAcronym(""));
    }
}