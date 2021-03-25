package Sensorer;

import java.io.IOException;

public class PulsSensor {

    public static Integer getPuls() throws NullPointerException{
        int puls;
        puls = (int) (Math.random()*(80-60)+60);

        return puls;
    }

    public static void main(String[] args) {
        PulsSensor pulsmaaling = new PulsSensor();
        System.out.println(pulsmaaling.getPuls());
    }
}
