package access;

public class Speaker {
    private int volume;
    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("volume is max, can't volume up");
        }else{
            volume += 10;
            System.out.println("volume 10 up");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("call volume Down");
    }

    void showVolume(){
        System.out.println("currnet volume : " + volume);
    }
}
