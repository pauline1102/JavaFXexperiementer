package db;
import javafx.fxml.FXML;
import java.awt.*;
import java.sql.*;

public class ConnectionUser {
    private final Connection connection;

    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private double spo2;
    private String SpO2="";
    private int ekg;
    private String EKG="";
    private double temp;
    private String TEMP="";
    private int puls;
    private String PULS="";

    public ConnectionUser(Connection connection) {
        this.connection = connection;
    }


    public void InsertBusraBilgin(String value1, double value2, double value3, int value4, int value5) {
        String maalinger = "INSERT INTO busrabilgin (Dato, SpO2, Temperatur, Puls, EKG) VALUES ( ?, ?, ?, ?, ?);";
        try {
            preparedStatement = connection.prepareStatement(maalinger);
            preparedStatement.setString(1, value1);
            preparedStatement.setDouble(2, value2);
            preparedStatement.setDouble(3, value3);
            preparedStatement.setInt(4, value4);
            preparedStatement.setInt(5, value5);
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("fejl");
        }
    }

    public String hentSpO2maaling() throws NullPointerException {
       String spo2maaling = "SELECT SpO2 FROM gruppe4.busrabilgin;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(spo2maaling);
            while(resultSet.next()){

                spo2 = resultSet.getDouble(1);
                SpO2 = String.valueOf(spo2);
                }
       } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("fejl2");
        }
        return SpO2;
    }

    public String hentEKGmaaling() throws NullPointerException {
        String EKGmaaling = "SELECT EKG FROM gruppe4.busrabilgin";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(EKGmaaling);
            while(resultSet.next()){
                ekg = resultSet.getInt(1);
                EKG = String.valueOf(ekg);}
        } catch (SQLException g) {
            g.printStackTrace();
            System.out.println("fejl3");
        }
        return EKG;
    }

    public String hentTempmaaling() throws NullPointerException {
        String tempmaaling = "SELECT Temperatur FROM gruppe4.busrabilgin";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(tempmaaling);
            while(resultSet.next()){
                temp = resultSet.getDouble(1);
                TEMP = String.valueOf(temp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("fejl3");
        }
        return TEMP;
    }
    public String hentPulsmaaling() throws NullPointerException {
        String pulsmaaling = "SELECT Puls FROM gruppe4.busrabilgin";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(pulsmaaling);
            while(resultSet.next()){
                puls = resultSet.getInt(1);
                PULS = String.valueOf(puls);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("fejl2");
        }
        return PULS;
    }

}

