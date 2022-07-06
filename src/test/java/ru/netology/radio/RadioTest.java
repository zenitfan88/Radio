package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void radioTest() {
        Radio station = new Radio(0, 0);
        Assertions.assertEquals(0, station.setPrewCurrentVolume());
        Radio station1 = new Radio(54, 0);
        Assertions.assertEquals(53, station1.setPrewCurrentVolume());
        Radio station2 = new Radio(100, 0);
        Assertions.assertEquals(100, station2.setNextCurrentVolume());
        Radio station3 = new Radio(38, 0);
        Assertions.assertEquals(39, station3.setNextCurrentVolume());
        Radio station4 = new Radio(0, 0);
        Assertions.assertEquals(14, station4.setPrewCurrentStation());
        Radio station5 = new Radio(0, 1);
        Assertions.assertEquals(0, station5.setPrewCurrentStation());
        Radio station6 = new Radio(0, 5);
        Assertions.assertEquals(6, station6.setNextCurrentStation());
        Radio station7 = new Radio(0, 14);
        Assertions.assertEquals(0, station7.setNextCurrentStation());
        Radio station8 = new Radio(12);
        Assertions.assertEquals(12, station8.setAmountStation());
        Radio station9 = new Radio(0);
        Assertions.assertEquals(10, station9.setAmountStation());
        Radio station10 = new Radio(0, 7);
        Assertions.assertEquals(7, station10.setCurrentStation());
    }
}