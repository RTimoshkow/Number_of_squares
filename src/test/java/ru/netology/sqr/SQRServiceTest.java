package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldNumderOfSqr() {
        SQRService sqrService = new SQRService();

        int lowLimit = 200;
        int upLimit = 300;
        int expected = 3;

        int quantityRoots = sqrService.countinQuantitySqr(lowLimit, upLimit);

        assertEquals(expected, quantityRoots);

        System.out.println(quantityRoots);
    }
}