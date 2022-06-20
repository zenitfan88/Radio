package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void nextCurrentStationUntilNine() {
        Radio station = new Radio();
        station.nextCurrentStation(2);

        int actual = station.nextCurrentStation();
        int expected1 = 3;
        Assertions.assertEquals(actual, expected1);
    }

    @Test
    void nextCurrentStationOverNine() {
        Radio station = new Radio();
        station.nextCurrentStation(9);

        int actual = station.nextCurrentStation();
        int expected2 = 0;
        Assertions.assertEquals(actual, expected2);


    }


    @Test
    void prewCurrentStationZero() {
        Radio station = new Radio();
        station.prewCurrentStation(0);
        int actual = station.prewCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prewCurrentStationUntilNine() {
        Radio station = new Radio();
        station.prewCurrentStation(9);
        int actual = station.prewCurrentStation();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextCurrentVolumeOverTen() {
        Radio volume = new Radio();
        volume.nextCurrentVolume(10);

        int actual = volume.nextCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextCurrentVolumeUntilTen() {
        Radio volumeMinus = new Radio();
        volumeMinus.nextCurrentVolume(6);

        int actual1 = volumeMinus.nextCurrentVolume();
        int expected2 = 7;
        Assertions.assertEquals(actual1, expected2);
    }

    @Test
    void prewCurrentVolumeZero() {
        Radio volume = new Radio();
        volume.prewCurrentVolume(0);

        int actual = volume.prewCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prewCurrentVolumeUntilTen() {
        Radio volume = new Radio();
        volume.prewCurrentVolume(6);

        int actual = volume.prewCurrentVolume();
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}

