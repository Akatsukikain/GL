package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    public void start(final Stage primaryStage) throws IOException {
     Parent root = FXMLLoader.load(getClass().getResource("View/Authentification.fxml"));
     primaryStage.setScene(new Scene(root, 600, 400));
     primaryStage.setTitle("ERip");
     primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
