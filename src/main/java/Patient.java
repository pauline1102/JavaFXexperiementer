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

