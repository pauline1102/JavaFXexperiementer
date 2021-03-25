package Sensorer;

public class SpO2Sensor {
    public static Integer getSpO2() throws NullPointerException {
        int SpO2;
        SpO2 = (int) (Math.random() * (100 - 95) + 95);

        return SpO2;
    }

    public static void main(String[] args) {
        SpO2Sensor spO2Maaling = new SpO2Sensor();
        System.out.println(spO2Maaling.getSpO2());
    }
}