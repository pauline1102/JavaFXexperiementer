package Sensorer;

public class TemperaturSensor {

    public double TemperaturSensor() {
        double temperatur;
        double celcius;
        while (true) {
            temperatur = (Math.random() * (200 - 150) + 150);
            celcius = (temperatur * 4 / 50) + 24;
            return celcius;
        }
    }

    public static void main(String[] args) {
        TemperaturSensor temp = new TemperaturSensor();
        System.out.println(temp.TemperaturSensor());
    }
}
