package oop1;

public class MusicPlayer {
    private boolean isOn;
    private int volume;


    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public void turnOn() {
        System.out.println("Music Player turn on");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Music Player turn off");
        isOn = false;
    }

    public void showStatus() {
        if (isOn) {
            System.out.println("Music player is on.  volume = " + volume);
        } else {
            System.out.println("Music player is off");
        }
    }
}
