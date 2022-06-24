package ru.netology.radio;

/*public class Radio {
    public int nextCurrentStation;
    public int prewCurrentStation;
    public int nextCurrentVolume;
    public int prewCurrentVolume;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;
    private int amountStation = 15;
    private int currentStation;
    private int currenVolume;


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
        if (amountStation > 0) {
            return this.amountStation = amountStation - 1;
        } else {
            return this.amountStation = 9;
        }
    }

    public int setCurrentStation() {
        this.currentStation = currentStation;
        return this.currentStation;
    }

    public int setNextCurrentStation() {
        amountStation = setAmountStation();
        if (currentStation >= 0 && currentStation < this.amountStation) {
            return this.nextCurrentStation = nextCurrentStation;
        }
        return this.nextCurrentStation = 0;
    }

    public int setPrewCurrentStation() {
        amountStation = setAmountStation();
        if (currentStation > 0 && currentStation < this.amountStation) {
            return prewCurrentStation;
        }
        return this.prewCurrentStation = this.amountStation;
    }
}*/
public class Radio {
    private int currentStation;
    private int nextCurrentStation;
    private int prewCurrentStation;
    private int nextCurrentVolume;
    private int prewCurrentVolume;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;
    private int amountStation = 15;


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

    public int setAmountStation() {
        if (amountStation > 0) {
            return this.amountStation = amountStation;
        } else {
            return this.amountStation = 10;
        }
    }

    public int setCurrentStation() {
        return this.currentStation;
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


