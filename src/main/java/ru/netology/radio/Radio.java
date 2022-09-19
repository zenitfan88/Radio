package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int nextCurrentStation;
    private int prewCurrentStation;
    private int nextCurrentVolume;
    private int prewCurrentVolume;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;
    private int amountStation;


    public Radio() {
        this.amountStation = 10;
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public Radio(int currentVolume, int currentStation) {
        this.nextCurrentVolume = currentVolume + 1;
        this.prewCurrentVolume = currentVolume - 1;
        this.nextCurrentStation = currentStation + 1;
        this.prewCurrentStation = currentStation - 1;
        this.currentStation = currentStation;
        if (amountStation == 0) {
            this.amountStation = 10;
        }
        if (amountStation != 0) {
            this.amountStation = amountStation;
        }
    }

    public int setNextCurrentVolume() {
        if (nextCurrentVolume >= minCurrentVolume && nextCurrentVolume < maxCurrentVolume) {
            return this.nextCurrentVolume = nextCurrentVolume;
        }
        return this.nextCurrentVolume = 100;
    }

    public int setPrewCurrentVolume() {
        if (prewCurrentVolume > minCurrentVolume && prewCurrentVolume <= maxCurrentVolume) {
            return this.prewCurrentVolume = prewCurrentVolume;
        }
        return this.prewCurrentVolume = 0;
    }

    public int setCurrentStation() {
        if (currentStation >= this.amountStation) {
            this.currentStation = amountStation - 1;
        }
        return currentStation;
    }

    public int setNextCurrentStation() {
        if (this.currentStation >= 0 && currentStation < this.amountStation) {
            return this.nextCurrentStation;
        }
        return this.nextCurrentStation = 0;
    }

    public int setPrewCurrentStation() {
        amountStation = amountStation - 1;
        if (currentStation > 0 && currentStation < this.amountStation) {
            return this.prewCurrentStation;
        }
        return this.prewCurrentStation = amountStation;
    }
}


