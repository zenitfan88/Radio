package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void nextCurrentStationUntilNine() {
        Radio station = new Radio();
        station.setCurrentStation(2);
        station.setNextCurrentStation();
        int actual = station.getCurrentStation();
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextCurrentStationOverNine() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.setNextCurrentStation();
        int actual = station.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prewCurrentStationZero() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.setPrewCurrentStation();
        int actual = station.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prewCurrentStationOverNine() {
        Radio station = new Radio();
        station.setCurrentStation(3);
        station.setPrewCurrentStation();
        int actual = station.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextCurrentVolumeUntilTen() {
        Radio volume = new Radio();
        volume.setCurrentVolume(6);
        volume.setNextCurrentVolume();
        int actual = volume.getCurrentVolume();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextCurrentVolumeOverTen() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.setNextCurrentVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prewCurrentVolumeUntilTen() {
        Radio volume = new Radio();
        volume.setCurrentVolume(6);
        volume.setPrewCurrentVolume();
        int actual = volume.getCurrentVolume();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prewCurrentVolumeZero() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.setPrewCurrentVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}

