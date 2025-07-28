package ru.netology.radioTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void shouldIncreaseVolumeIfBelowMax() {
        Radio radio = new Radio();
        radio.currentVolume = 99;
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.currentVolume);
    }

    @Test
    public void shouldDecreaseVolumeIfAboveMin() {
        Radio radio = new Radio();
        radio.currentVolume = 1;
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.currentVolume);
    }

    @Test
    public void shouldNotDecreaseVolumeIfAtMin() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.currentVolume);
    }

    @Test
    public void shouldNotIncreaseVolumeIfAtMax() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.currentVolume);
    }

    @Test
    public void shouldIncreaseVolumeFrom50To51() {
        Radio radio = new Radio();
        radio.currentVolume = 50;
        radio.increaseVolume();
        Assertions.assertEquals(51, radio.currentVolume);
    }

    @Test
    public void shouldDecreaseVolumeFrom50To49() {
        Radio radio = new Radio();
        radio.currentVolume = 50;
        radio.decreaseVolume();
        Assertions.assertEquals(49, radio.currentVolume);
    }


    @Test
    public void shouldNextIncreaseStationFrom0To1() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.next();
        Assertions.assertEquals(1, radio.currentStation);
    }

    @Test
    public void shouldNextWrapStationFrom9To0() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.next();
        Assertions.assertEquals(0, radio.currentStation);
    }

    @Test
    public void shouldPrevDecreaseStationFrom9To8() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.prev();
        Assertions.assertEquals(8, radio.currentStation);
    }

    @Test
    public void shouldPrevWrapStationFrom0To9() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.prev();
        Assertions.assertEquals(9, radio.currentStation);
    }

    @Test
    public void shouldNextIncreaseStationFrom5To6() {
        Radio radio = new Radio();
        radio.currentStation = 5;
        radio.next();
        Assertions.assertEquals(6, radio.currentStation);
    }

    @Test
    public void shouldPrevDecreaseStationFrom5To4() {
        Radio radio = new Radio();
        radio.currentStation = 5;
        radio.prev();
        Assertions.assertEquals(4, radio.currentStation);
    }


    @Test
    public void shouldSetStationToMinBoundary() {
        Radio radio = new Radio();
        radio.setCurrentStation(0); ;
        Assertions.assertEquals(0, radio.currentStation);
    }

    @Test
    public void shouldSetStationToMaxBoundary() {
        Radio radio = new Radio();
        radio.setCurrentStation(9); ;
        Assertions.assertEquals(9, radio.currentStation);
    }
    @Test
    public void shouldIgnoreStationJustBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(-15); ;
        Assertions.assertEquals(5, radio.currentStation);
    }
    @Test
    public void shouldIgnoreStationJustAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(15); ;
        Assertions.assertEquals(5, radio.currentStation);
    }




}
