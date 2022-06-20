package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalculate() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNegNumber() {
        SQRService service = new SQRService();
        int actual = service.calculate(-200, -300);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcBigNumber() {
        SQRService service = new SQRService();
        int actual = service.calculate(1_000_000, 3_000_000);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
