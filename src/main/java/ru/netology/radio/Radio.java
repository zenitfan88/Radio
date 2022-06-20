package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void nextCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < 9) {
            this.currentStation = currentStation + 1;
        }
        currentStation = 0;
    }

    public int nextCurrentStation() {
        return currentStation;
    }

    public void prewCurrentStation(int currentStation) {
        if (currentStation > 0 && currentStation <= 9) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            this.currentStation = 9;
        }
    }

    public int prewCurrentStation() {
        return currentStation;
    }

    public void nextCurrentVolume(int currentVolume) {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            this.currentVolume = 10;
        }
    }

    public int nextCurrentVolume() {
        return currentVolume;
    }

    public void prewCurrentVolume(int currentVolume) {
        if (currentVolume > 0 && currentVolume <= 10) {
            this.currentVolume = currentVolume - 1;
        }
        currentVolume = 0;
    }

    public int prewCurrentVolume() {
        return currentVolume;
    }
}

