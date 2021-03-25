package Sensorer;

public class TemperaturSensor {

    public double TemperaturSensor() {
        double temperatur;
        double celsius;
        while (true) {
            temperatur = (Math.random() * (200 - 150) + 150);
            celsius = (temperatur * 4 / 50) + 24;
            return celsius;
        }
    }

    public static void main(String[] args) {
        TemperaturSensor temp = new TemperaturSensor();
        System.out.println(temp.TemperaturSensor());
    }
}
