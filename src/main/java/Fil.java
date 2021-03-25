import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Fil {
    public void filer() {
        try {
            LocalDate dato = LocalDate.now();
            FileWriter fw = new FileWriter("C:\\Users\\hanse\\OneDrive\\Dokumenter\\DTU\\2. Semester\\Informationsvidenskab 2\\Delaflevering 1\\Fil\\Fil.csv");

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}