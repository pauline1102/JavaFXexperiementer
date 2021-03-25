import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;



import java.io.IOException;

public class Logincontroller {


    public TextField CPRfelt;
    public Label statuslabel;
    @FXML
    TextField tekstfelt;
    @FXML
    PasswordField password;

    //@FXML
    //Button logoutbutton;
    @FXML
    private void switchToPrimary() throws IOException {



    }


    public void loginvalidation(ActionEvent actionEvent) throws IOException {


        if(tekstfelt.getText().contains("læge")){
            StartUp.setRoot("doctorScene");
        } if(tekstfelt.getText().contains("syg")){
            StartUp.setRoot("patientScene");
        }
    }

    public void logout() throws IOException {
        StartUp.setRoot("masterlogin");
    }

    public void updateLabel(KeyEvent keyEvent) {
      String cpr = CPRfelt.getText();
      if(cpr.length()==11){
          statuslabel.setText("Søger efter bruger:"+cpr);
        }

        }


    }

