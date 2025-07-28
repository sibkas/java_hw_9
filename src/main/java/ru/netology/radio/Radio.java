package ru.netology.radio;

public class Radio {
    public int currentVolume;
    public int currentStation;

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentStation(int station) {
        if (station >=0 && station <=9) {
            currentStation = station;
        }
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        }
        else {
            currentStation =  currentStation + 1;
        }

    }
    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        else {
            currentStation = currentStation - 1;
        }
    }
}
