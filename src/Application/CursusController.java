package Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CursusController implements Initializable {

    public Button consulter ;
    public ListView<Test> destination;


    Test canada = new Test("Canada");
    Test france = new Test("France");


    ObservableList<Test> uni = FXCollections.observableArrayList(canada,france);

    public void initialize(URL url, ResourceBundle resourceBundle) {
        destination.setItems(uni);
        destination.setCellFactory(lv -> new TestCell());
    }

    public void ConsulterOnButtonClicked() throws IOException {
        Stage currentStage = (Stage) consulter.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/UniversitesPartenaires.fxml"))));
    }
}
