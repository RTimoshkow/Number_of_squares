package ru.netology.sqr;

public class SQRService {


    public int countinQuantitySqr(int lowLimit, int upLimit) {

        int quantityRoots = 0;

        for (int i = 10; i < 100; i++) {
            int sqr = i * i;
            if (sqr <= upLimit && sqr >= lowLimit) {
                quantityRoots++;

            }
        }
        return quantityRoots;
    }
}
