package db;

import java.sql.Connection;

public class UseDB {
    public static void main(String[] args) {
        DBConnector dbc = new DBConnector();
        Connection conn = dbc.getMYSQLConnection("pauline","Pauline1234", "sundtek");
        ConnectionUser cu = new ConnectionUser(conn);
        cu.InsertInTable("Henning", 57);

    }
}
