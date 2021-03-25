package Sensorer;

public class EKGSensor {
    public static Integer getEKG() throws NullPointerException{
        int EKG;
        EKG = (int) (Math.random()*(80-60)+60);

        return EKG;
    }

    public static void main(String[] args) {
        EKGSensor ekgmaaling = new EKGSensor();
        System.out.println(ekgmaaling.getEKG());
    }
}