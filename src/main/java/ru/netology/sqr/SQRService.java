package ru.netology.sqr;

public class SQRService {


    public int numderOfSqr(int lowLimit, int upLimit, int initialValue) {

        for (int i = 10; i < 100; i++) {
            if (i * i <= upLimit && i * i >= lowLimit) {
                initialValue++;

            }
        }
        return initialValue;
    }
}
