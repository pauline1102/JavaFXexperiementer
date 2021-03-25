import Sensorer.PulsSensor;
import Sensorer.SpO2Sensor;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;

public class Vindue6Busra {
    @FXML
    private
    TextField nySpO2Value;

    @FXML
    private void startSpO2Maling(){
    SpO2Sensor s = new SpO2Sensor();
    int nySpO2Maling = s.getSpO2();
    nySpO2Value.appendText(nySpO2Maling);
        nySpO2Value.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable,
                                Number oldValue, Number newValue) {

                outputTextArea.appendText("Slider Value Changed (newValue: " + newValue.intValue() + ")\n");
            }
        });
            }

        }
    
    @FXML
    private TextField nySpO2Value;

    public void initialize(){
        nySpO2Value.textProperty().addListener(nySpO2Maling) -> {
            System.out.println(nySpO2Maling);
        }

        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("textfield changed from " + oldValue + " to " + newValue);
        });
    }

}