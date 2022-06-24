package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setNextCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < 9) {
            this.currentStation = currentStation + 1;
        }
        currentStation = 0;
    }

    public int getNextCurrentStation() {
        return currentStation;
    }

    public void setPrewCurrentStation(int currentStation) {
        if (currentStation > 0 && currentStation <= 9) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            this.currentStation = 9;
        }
    }

    public int getPrewCurrentStation() {
        return currentStation;
    }

    public void setNextCurrentVolume(int currentVolume) {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            this.currentVolume = 10;
        }
    }

    public int getNextCurrentVolume() {
        return currentVolume;
    }

    public void setPrewCurrentVolume(int currentVolume) {
        if (currentVolume > 0 && currentVolume <= 10) {
            this.currentVolume = currentVolume - 1;
        }
        currentVolume = 0;
    }

    public int getPrewCurrentVolume() {
        return currentVolume;
    }

}

