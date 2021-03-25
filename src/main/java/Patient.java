import java.util.ArrayList;

public class Patient extends Person {
    private int CPR;
    public int Alder;
    public double Temp;
    public double EKG;
    public double Puls;
    public double SpO2;


    public Patient (String Navn, String Brugernavn, String Password, int CPR, int Alder) {
        this.Navn = Navn;
        this.Brugernavn = Brugernavn;
        this.Password = Password;
        this.CPR = CPR;
        this.Alder = Alder;
    }
    //Har forsøgt at sætte den i Main i stedet
   /* public ArrayList<Patient> getPatienter(){
        ArrayList<Patient> patienter = new ArrayList<Patient>();
        Patient patient1 = new Patient("Pauline Hansen", "PaulineHansen", "123456", "060396", 25);
        Patient patient2 = new Patient("Busra Bilgin", "BusraBilgin", "654321", "301100", 20);
        Patient patient3 = new Patient("Maya Hussein", "MayaHussein", "567890", "280198", 23);
        Patient patient4 = new Patient("Hawra Shaya", "HawraShaya", "098765", "111190", 30);
        patienter.add(patient1);
        patienter.add(patient2);
        patienter.add(patient3);
        patienter.add(patient4);

        return patienter;
    }
    */

    //public ArrayList<Patient> getNavneListe() {}

    /*ArrayList<Patient> navneListe = new ArrayList<>() {

        return navneListe;
    }
    }
*/
    //ArrayList<Patient> patienter = new ArrayList<>();
      /*  patienter.add(patient1);
                patienter.add(patient2);
                patienter.add(patient3);
                patienter.add(patient4);

       */
        public int getCPR(){
            return CPR;
        }

        public void setCPR(int CPR){
            this.CPR = CPR;
        }


        public int getAlder(){
            return Alder;
        }

        public void setAlder (int Alder){
          this.Alder = Alder;
        }

    }

