package test_implementation;

import test_implementation.sfx.AudioLoader;

public class Main {

    public static void main(String[] args) {

        AudioLoader test = new AudioLoader();
        test.loadAudioTestTwo();
        test.playAudio();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        test.interruptAudioTestThree();

    }


}
