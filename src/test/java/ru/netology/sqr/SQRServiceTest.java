package ru.netology.sqr;

import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public void shouldNumderOfSqr() {
        SQRService sqrService = new SQRService();

        int lowLimit = 200;
        int upLimit = 300;
        int initialValue = 0;


        int numberSQR = sqrService.numderOfSqr(lowLimit, upLimit, initialValue);

        System.out.println(numberSQR);
    }
}