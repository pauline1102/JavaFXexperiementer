package db;
import java.sql.*;

public class ConnectionUser {
    private final Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public ConnectionUser(Connection connection){
        this.connection = connection;
    }

    public void InsertInTable(String value1, int value2){
        String SQLNavne = "INSERT INTO pauline (navn, alder) VALUES (?, ?);";
        try{
        preparedStatement = connection.prepareStatement(SQLNavne);
        preparedStatement.setString(1,value1);
        preparedStatement.setInt(2,value2);
        preparedStatement.execute();
        } catch(SQLException ex){

        }
    }
}
