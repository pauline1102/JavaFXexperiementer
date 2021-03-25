import Sensorer.EKGSensor;
import Sensorer.PulsSensor;
import Sensorer.SpO2Sensor;
import Sensorer.TemperaturSensor;
import java.util.Scanner;

public class PatientVærdier {
    public static void main(String[] args) {
        EKGSensor ekgVærdi = new EKGSensor();
        PulsSensor pulsVærdi = new PulsSensor();
        SpO2Sensor spO2Værdi = new SpO2Sensor();
        TemperaturSensor tempVærdi = new TemperaturSensor();
        Scanner Tastatur = new Scanner(System.in);
        Patient patient1 = new Patient("Pauline Hansen", "PaulineHansen", "123456", 290498, 25);
        Patient patient2 = new Patient("Busra Bilgin", "BusraBilgin", "654321", 301100, 20);
        Patient patient3 = new Patient("Maya Hussein", "MayaHussein", "567890", 280198, 23);
        Patient patient4 = new Patient("Hawra Shaya", "HawraShaya", "098765", 111190, 30);

        System.out.println("Indtast CPR-nummer: ");
        int CPR;
        CPR = Tastatur.nextInt();
        Tastatur.nextLine();
        if (CPR == 290498){
            System.out.println("Navn: "+ patient1.getNavn());
            System.out.println("CPR-nummer: "+ patient1.getCPR());
            System.out.println("Alder: " + patient1.getAlder());
            System.out.println("Puls måling: " + pulsVærdi.getPuls());
            System.out.println("SpO2 måling: " + spO2Værdi.getSpO2());
            System.out.println("Temperatur måling: " + tempVærdi.TemperaturSensor());
            System.out.println(("EKG måling: " + ekgVærdi.getEKG()));

        } else if (CPR == 301100){
            System.out.println("Navn: "+ patient2.getNavn());
            System.out.println("CPR-nummer: "+ patient2.getCPR());
            System.out.println("Alder: " + patient2.getAlder());
            System.out.println("Puls måling: " + pulsVærdi.getPuls());
            System.out.println("SpO2 måling: " + spO2Værdi.getSpO2());
            System.out.println("Temperatur måling: " + tempVærdi.TemperaturSensor());
            System.out.println(("EKG måling: " + ekgVærdi.getEKG()));
        } else if (CPR == 280198){
            System.out.println("Navn: "+ patient3.getNavn());
            System.out.println("CPR-nummer: "+ patient3.getCPR());
            System.out.println("Alder: " + patient3.getAlder());
            System.out.println("Puls måling: " + pulsVærdi.getPuls());
            System.out.println("SpO2 måling: " + spO2Værdi.getSpO2());
            System.out.println("Temperatur måling: " + tempVærdi.TemperaturSensor());
            System.out.println(("EKG måling: " + ekgVærdi.getEKG()));
        } else if (CPR == 111190){
            System.out.println("Navn: "+ patient4.getNavn());
            System.out.println("CPR-nummer: "+ patient4.getCPR());
            System.out.println("Alder: " + patient4.getAlder());
            System.out.println("Puls måling: " + pulsVærdi.getPuls());
            System.out.println("SpO2 måling: " + spO2Værdi.getSpO2());
            System.out.println("Temperatur måling: " + tempVærdi.TemperaturSensor());
            System.out.println(("EKG måling: " + ekgVærdi.getEKG()));
        } else{
            System.out.println("Fejl");
        }
    }

}
