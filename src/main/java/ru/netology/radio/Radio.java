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

    public int setAmountStation() { // задаем количество станций
        if (amountStation != 0) { // если задано количество станций
            this.amountStation = amountStation; // то используем заданное количество
        } else {
            this.amountStation = 10; // если не задано, то используем по умолчанию
        }
        return this.amountStation;
    }

    public int setCurrentStation() { // выбираем станцию
        if (currentStation >= setAmountStation()) { // если выбранная станция больше, чем количество
            this.currentStation=setAmountStation()-1; // то выбирается последняя максимальная
        }
       return currentStation;
    }

    public int setNextCurrentStation() {
        amountStation = setAmountStation() - 1;
        if (this.currentStation >= 0 && currentStation < this.amountStation) {
            return this.nextCurrentStation;
        }
        return this.nextCurrentStation = 0;
    }

    public int setPrewCurrentStation() {
        amountStation = setAmountStation() - 1;
        if (currentStation > 0 && currentStation < this.amountStation) {
            return this.prewCurrentStation;
        }
        return this.prewCurrentStation = this.amountStation;
    }
}


