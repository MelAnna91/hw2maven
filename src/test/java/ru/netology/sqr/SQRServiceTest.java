package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldSgrCount() {

        SQRService service = new SQRService();
        int actual = service.sqr(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSgrCount1() {

        SQRService service = new SQRService();
        int actual = service.sqr(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSgrCount2() {

        SQRService service = new SQRService();
        int actual = service.sqr(300, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSgrCount3() {

        SQRService service = new SQRService();
        int actual = service.sqr(-200, -300);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
