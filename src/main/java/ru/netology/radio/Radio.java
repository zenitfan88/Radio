package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;


    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setNextCurrentStation() {
        if (currentStation >= 0 && currentStation < 9) {
            currentStation = currentStation + 1;
        } else currentStation = 0;
    }

    public void setPrewCurrentStation() {
        if (currentStation > 0 && currentStation <= 9) {
            currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            currentStation = 9;
        }
    }

    public void setNextCurrentVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }


    public void setPrewCurrentVolume() {
        if (currentVolume > 0 && currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        } else currentVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}

