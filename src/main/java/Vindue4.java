import java.io.IOException;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Vindue4 {

    public void switchToMasterlogin(ActionEvent actionEvent) throws IOException {
        StartUp.setRoot("masterlogin");
    }
}
