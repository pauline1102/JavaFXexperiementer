import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import java.util.ArrayList;

/*
public class FxApp extends Application {
    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws IOException{
        scene = new Scene(loadFXML("secondary"),640,480);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    static void setRoot(String fxml) throws IOException{
       //scene.setRoot(loadFXML(fxml));
        scene.setRoot(loadFXML(fxml));
      //  scene3.setRoot(loadFXML(fxml));
    }
    private static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlloader = new FXMLLoader(FxApp.class.getResource(fxml + ".fxml"));
        return fxmlloader.load();
    }
    public void main(String[] args) {
        launch(args);
    }
}

*/
