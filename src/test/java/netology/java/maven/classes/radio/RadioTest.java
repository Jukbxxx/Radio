package netology.java.maven.classes.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10);

    @Test

    public void shouldSetCurrentStationIfValidDoubleCheck() {//Дополнительный тест для случая, если станций 20
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetCurrentStationIfAboveMax() {
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetCurrentStationIfBelowMin() {
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToNextStation() {
        radio.setCurrentStation(3);
        radio.changeToNextStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldChangeNextToZeroIfMax() {
        radio.setCurrentStation(9);
        radio.changeToNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToPreviousStation() {
        radio.setCurrentStation(8);
        radio.changeToPreviousStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePrevToMaxIfZero() {
        radio.setCurrentStation(0);
        radio.changeToPreviousStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(1);
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeIfMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeIfMin() {
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeIfBelowMin() {
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetCurrentVolumeIfAboveMax() {
        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldWorkWithoutStationsAmount() {
        Radio radio = new Radio(); //Инициируем заново без указания параметра
        radio.setCurrentStation(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }
}
