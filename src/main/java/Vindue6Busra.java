import Sensorer.PulsSensor;
import Sensorer.SpO2Sensor;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import db.ConnectionUser;
import db.DBConnector;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Labeled;
import javafx.scene.input.KeyEvent;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

public class Vindue6Busra {

    public javafx.scene.control.Label visdata;
    public javafx.scene.control.Label tempmaaling;
    public javafx.scene.control.Label ekgmaaling;
    public javafx.scene.control.Label pulsmaaling;

    DBConnector dbc = new DBConnector();
    Connection conn = dbc.getMYSQLConnection("pauline", "Pauline1234", "gruppe4");
    ConnectionUser cu = new ConnectionUser(conn);
@FXML
    public void switchToMasterLogin(ActionEvent actionEvent) throws IOException {
        StartUp.setRoot("masterlogin");
    }

@FXML
    public void visSpO2maaling(ActionEvent actionEvent) throws IOException {
    visdata.setText(cu.hentSpO2maaling());
}
@FXML
    public void visEKGmaaling(ActionEvent actionEvent) throws IOException{
    ekgmaaling.setText(cu.hentEKGmaaling());
}

@FXML
    public void visTempmaaling(ActionEvent actionEvent) throws IOException {
    tempmaaling.setText(cu.hentTempmaaling());
}
@FXML
    public void visPulsmaaling(ActionEvent actionEvent) throws IOException {
    pulsmaaling.setText(cu.hentPulsmaaling());
}

    }

