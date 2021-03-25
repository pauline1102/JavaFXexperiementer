import Sensorer.PulsSensor;
import Sensorer.SpO2Sensor;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Labeled;
import javafx.scene.input.KeyEvent;

import java.awt.*;
import java.io.IOException;

public class Vindue6Busra {

    @FXML
    private Label nyVærdi;

    public void switchToMasterLogin(ActionEvent actionEvent) throws IOException {
        StartUp.setRoot("masterlogin");
    }
/*
    public void StartMalingS(ActionEvent actionEvent) throws NullPointerException {
        //SpO2Sensor s = new SpO2Sensor();
        nyVærdi.setText("Ny værdi: " + SpO2Sensor.getSpO2());
    }

 */
}