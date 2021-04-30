import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.fxml.*;

import java.io.IOException;
import java.util.ArrayList;


public class Vindue5 {
    @FXML
    private void switchToVindue6Busra() throws IOException {
        StartUp.setRoot("vindue6Busra");
    }

    public void switchtoMasterLogin(ActionEvent actionEvent) throws IOException {
        StartUp.setRoot("masterlogin");
    }
}
