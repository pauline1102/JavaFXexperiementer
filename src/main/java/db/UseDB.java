package db;

import java.lang.Thread;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class UseDB {
    public static void main(String[] args) throws InterruptedException {
        DBConnector dbc = new DBConnector();
        Connection conn = dbc.getMYSQLConnection("pauline", "Pauline1234", "gruppe4");
        ConnectionUser cu = new ConnectionUser(conn);
        String dato;

        while (true) {
            double spo2 =  (Math.random() * (100 - 95) + 95);
            double precelcius = (Math.random() * (200 - 150) + 150);
            double temperatur = (precelcius * 4 / 50) + 24;
            int puls = (int) (Math.random() * (80 - 60) + 60);
            int ekg = 99;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            dato = now.format(dtf);
            cu.InsertBusraBilgin(dato, spo2, temperatur, puls, ekg);
            Thread.sleep(10000);

        }
    }
}