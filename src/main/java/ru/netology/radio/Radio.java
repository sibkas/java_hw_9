package ru.netology.radio;

import lombok.Getter;

@Getter
public class Radio {
    public int currentVolume;
    public int currentStation;
    public int stationsCount;


    // Конструктор по умолчанию
    public Radio() {
        this.stationsCount = 10;    // по умолчанию 10 станций
        this.currentStation = 0;    // текущая станция — 0
        this.currentVolume = 0;     // громкость — 0
    }

    public Radio(int stationsCount) {
        if (stationsCount <= 0) {
            this.stationsCount = 10; // защита от некорректного значения
        } else {
            this.stationsCount = stationsCount;
        }
        this.currentStation = 0;
        this.currentVolume = 0;
    }

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
        if (station >= 0 && station < stationsCount) {
            currentStation = station;
        }
    }

    public void next() {
        if (currentStation == stationsCount - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }

    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationsCount - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }
}