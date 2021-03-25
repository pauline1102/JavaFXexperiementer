import java.util.ArrayList;

public class BrugPatienter {
    public static void main(String[] args) {
        ArrayList<Patient> patienter = new ArrayList<Patient>();
        Patient patient1 = new Patient("Pauline Hansen", "PaulineHansen", "123456", 060300, 25);
        Patient patient2 = new Patient("Busra Bilgin", "BusraBilgin", "654321", 301100, 20);
        Patient patient3 = new Patient("Maya Hussein", "MayaHussein", "567890", 280198, 23);
        Patient patient4 = new Patient("Hawra Shaya", "HawraShaya", "098765", 111190, 30);
        patienter.add(patient1);
        patienter.add(patient2);
        patienter.add(patient3);
        patienter.add(patient4);

        for(Patient p: patienter){
            int alder = p.getAlder();
            System.out.println(alder);
        }
    }
}
