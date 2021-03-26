import java.util.ArrayList;

public class PatientController {
    public ArrayList<Patient> getPatients() {
        Patient patient1 = new Patient("Pauline Hansen", "PaulineHansen", "123456", 290498, 25);
        Patient patient2 = new Patient("Busra Bilgin", "BusraBilgin", "654321", 301100, 20);
        Patient patient3 = new Patient("Maya Hussein", "MayaHussein", "567890", 280198, 23);
        Patient patient4 = new Patient("Hawra Shaya", "HawraShaya", "098765", 111190, 30);
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public ArrayList<Patient> patients;
}
