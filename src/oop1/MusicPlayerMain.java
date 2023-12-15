package oop1;

public class MusicPlayerMain {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.turnOn();
        musicPlayer.volumeUp();
        musicPlayer.showStatus();
        musicPlayer.volumeUp();
        musicPlayer.showStatus();
        musicPlayer.volumeDown();
        musicPlayer.showStatus();
        musicPlayer.turnOff();
    }
}
