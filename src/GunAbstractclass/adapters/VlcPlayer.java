package GunAbstractclass.adapters;

import GunAbstractclass.adapters.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }

    @Override
    public void playFlac(String fileName){
        //do nothing
    }

    @Override
    public void playAvi(String fileName) {
        //do nothing
    }
}