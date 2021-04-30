import db.ConnectionUser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;

public class StartUp extends Application {
    private static Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        scene = new Scene(loadFXML("masterlogin"),500,400);
        primaryStage.setScene(scene);

        primaryStage.show();

    }
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));

    }
    private static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlloader = new FXMLLoader(StartUp.class.getResource(fxml + ".fxml"));
        return fxmlloader.load();
    }
}
