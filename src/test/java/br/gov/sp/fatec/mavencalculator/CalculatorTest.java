package br.gov.sp.fatec.mavencalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    static final int BASE_TEST_NUMBER = 1;
    static final int NEGATIVE_TEST_NUMBER = -1;
    static final int ODD_TEST_NUMBER = 3;
    static final int EVEN_TEST_NUMBER = 2;

    private Calculator calc;

    @BeforeEach
    void init() {
        calc = new Calculator(BASE_TEST_NUMBER, BASE_TEST_NUMBER);
    }

    @Test
    void testSum() {
        assertEquals(calc.sum(), BASE_TEST_NUMBER + BASE_TEST_NUMBER);
    }

    @Test
    void testSumWithNegativeInput() {
        calc.setNum2(NEGATIVE_TEST_NUMBER);
        assertEquals(calc.sum(), BASE_TEST_NUMBER + NEGATIVE_TEST_NUMBER);
    }

    @Test
    void testDiv() {
        assertEquals(calc.div(), BASE_TEST_NUMBER / BASE_TEST_NUMBER);
    }

    @Test
    void testDivWithOddAndEvenInput() {
        calc.setNum1(ODD_TEST_NUMBER);
        calc.setNum2(EVEN_TEST_NUMBER);
        assertEquals(calc.div(), ODD_TEST_NUMBER / EVEN_TEST_NUMBER);
    }

    @Test
    void testDif() {
        assertEquals(calc.dif(), BASE_TEST_NUMBER - BASE_TEST_NUMBER);
    }

    @Test
    void testDifWithNegativeInput() {
        calc.setNum2(NEGATIVE_TEST_NUMBER);
        assertEquals(calc.dif(), BASE_TEST_NUMBER - NEGATIVE_TEST_NUMBER);
    }
}
