package ru.netology.radio;

public class Radio {
    public int nextCurrentStation;
    public int prewCurrentStation;
    public int nextCurrentVolume;
    public int prewCurrentVolume;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;
    int amountStation=15;


    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public Radio(int currentVolume, int currentStation) {
        this.nextCurrentVolume = currentVolume + 1;
        this.prewCurrentVolume = currentVolume - 1;
        this.nextCurrentStation = currentStation + 1;
        this.prewCurrentStation = currentStation - 1;
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

    public int setAmountStation() {
        if (this.amountStation > 0) {
            return this.amountStation = amountStation - 1;
        } else {
            return this.amountStation = 9;
        }
    }

    public int setNextCurrentStation() {
        amountStation = setAmountStation();
        if (nextCurrentStation >= 0 && nextCurrentStation < this.amountStation) {
            return this.nextCurrentStation = nextCurrentStation;
        }
        return this.nextCurrentStation = 0;
    }

    public int setPrewCurrentStation() {
        amountStation = setAmountStation();
        if (prewCurrentStation > 0 && prewCurrentStation < this.amountStation) {
            return this.prewCurrentStation = prewCurrentStation;
        }
        return this.prewCurrentStation = this.amountStation;
    }
}


