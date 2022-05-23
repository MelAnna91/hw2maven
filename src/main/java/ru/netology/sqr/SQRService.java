package ru.netology.sqr;

public class SQRService {
    public int sqr(int x, int y) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int z = i * i;
            if (x <= z && z <= y) {
                count++;
            }
        }
        return count;
    }
}
