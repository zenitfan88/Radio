package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void nextCurrentStationUntilNine() {
        Radio station = new Radio();
        station.setNextCurrentStation(2);
        int actual = station.getNextCurrentStation();
        int expected1 = 3;
        Assertions.assertEquals(actual, expected1);
    }

    @Test
    void nextCurrentStationOverNine() {
        Radio station = new Radio();
        station.setNextCurrentStation(9);
        int actual = station.getNextCurrentStation();
        int expected2 = 0;
        Assertions.assertEquals(actual, expected2);
    }

    @Test
    void prewCurrentStationZero() {
        Radio station = new Radio();
        station.setPrewCurrentStation(0);
        int actual = station.getPrewCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextCurrentVolumeUntilTen() {
        Radio volumeMinus = new Radio();
        volumeMinus.setNextCurrentVolume(6);
        int actual1 = volumeMinus.getNextCurrentVolume();
        int expected2 = 7;
        Assertions.assertEquals(actual1, expected2);
    }

    @Test
    void nextCurrentVolumeOverTen() {
        Radio volume = new Radio();
        volume.setNextCurrentVolume(10);
        int actual = volume.getNextCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prewCurrentVolumeUntilTen() {
        Radio volume = new Radio();
        volume.setPrewCurrentVolume(6);

        int actual = volume.getPrewCurrentVolume();
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prewCurrentVolumeZero() {
        Radio volume = new Radio();
        volume.setPrewCurrentVolume(0);
        int actual = volume.getPrewCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
}

