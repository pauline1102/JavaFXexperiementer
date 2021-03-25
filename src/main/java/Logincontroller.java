import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

import java.awt.*;
import java.io.IOException;

public class Logincontroller {

    @FXML
    TextField login;
    @FXML
    PasswordField password;
    @FXML
    private void switchToPrimary() throws IOException {

        if(login.getText().contains("læge")){
            StartUp.setRoot("");
        } if(login.getText().contains("syg")){
            StartUp.setRoot("");
        }


    }




}
