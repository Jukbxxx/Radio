package netology.java.maven.classes.radio;

public class Radio {
    public int currentStation; //Номер текущей радиостанции
    public int currentVolume; //Текущая громкость звука

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void changeToNextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void changeToPreviousStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
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

    //   такой метод не нужен =)
    //   public void setCurrentVolume(int newCurrentVolume) {
    //       if (newCurrentVolume < 0) {
    //           return;
    //       }
    //      if (newCurrentVolume > 10) {
//            return;
//        }
//        currentVolume = newCurrentVolume;
    //   }
}
