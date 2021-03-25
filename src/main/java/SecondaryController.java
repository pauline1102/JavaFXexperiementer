import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {
    @FXML
    private void switchToPrimary() throws IOException{
        StartUp.setRoot("primary");
    }
    @FXML
    private void switchToVindue3 () throws IOException{
        StartUp.setRoot("vindue31");
    }
}
