package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio fruit = new Radio();

    @Test
    public void shouldNextStation() {
        int currentStation = 9;
        fruit.setCurrentStation(currentStation);
        fruit.nextRadioStation();
        assertEquals(0, fruit.getCurrentStation());
    }

    @Test
    public void shouldNextStation1() {
        int currentStation = 5;
        fruit.setCurrentStation(currentStation);
        fruit.nextRadioStation();
        assertEquals(6, fruit.getCurrentStation());
    }

    @Test
    public void shouldNextStation2() {
        int currentStation = 10;
        fruit.setCurrentStation(currentStation);
        fruit.nextRadioStation();
        assertEquals(1, fruit.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        int currentStation = 0;
        fruit.setCurrentStation(currentStation);
        fruit.prevRadioStation();
        assertEquals(9, fruit.getCurrentStation());
    }

    @Test
    public void shouldPrevStation1() {
        int currentStation = -1;
        fruit.setCurrentStation(currentStation);
        fruit.prevRadioStation();
        assertEquals(9, fruit.getCurrentStation());
    }

    @Test
    public void shouldPrevStation2() {
        int currentStation = 5;
        fruit.setCurrentStation(currentStation);
        fruit.prevRadioStation();
        assertEquals(4, fruit.getCurrentStation());
    }

    @Test
    public void shouldInputRadioStation() {
        int RadioStation = 7;
        int currentStation = 2;
        fruit.setCurrentStation(currentStation);
        fruit.inputRadioStation(RadioStation);
        assertEquals(7, fruit.getCurrentStation());
    }

    @Test
    public void shouldInputRadioStation1() {
        int RadioStation = 10;
        int currentStation = 2;
        fruit.setCurrentStation(currentStation);
        fruit.inputRadioStation(RadioStation);
        assertEquals(2, fruit.getCurrentStation());
    }

    @Test
    public void shouldInputRadioStation2() {
        int RadioStation = -1;
        int currentStation = 2;
        fruit.setCurrentStation(currentStation);
        fruit.inputRadioStation(RadioStation);
        assertEquals(2, fruit.getCurrentStation());
    }

    @Test
    public void shouldSoundVolumePlus() {
        int currentVolume = 10;
        fruit.setCurrentVolume(currentVolume);
        fruit.soundVolumePlus();
        assertEquals(10, fruit.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumePlus1() {
        int currentVolume = 5;
        fruit.setCurrentVolume(currentVolume);
        fruit.soundVolumePlus();
        assertEquals(6, fruit.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumePlus2() {
        int currentVolume = 11;
        fruit.setCurrentVolume(currentVolume);
        fruit.soundVolumePlus();
        assertEquals(1, fruit.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumeMinus() {
        int currentVolume = 5;
        fruit.setCurrentVolume(currentVolume);
        fruit.soundVolumeMinus();
        assertEquals(4, fruit.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumeMinus1() {
        int currentVolume = 0;
        fruit.setCurrentVolume(currentVolume);
        fruit.soundVolumeMinus();
        assertEquals(0, fruit.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumeMinus2() {
        int currentVolume = -1;
        fruit.setCurrentVolume(currentVolume);
        fruit.soundVolumeMinus();
        assertEquals(0, fruit.getCurrentVolume());
    }


}