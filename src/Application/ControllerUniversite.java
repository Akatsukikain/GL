package Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerUniversite implements Initializable{

    public BorderPane menuPrincipal;
    public ListView<Test> universite;


    Test laval = new Test("Laval");
    Test polytechnique_montréal = new Test("Polytechnique Montréal");


    ObservableList<Test> uni = FXCollections.observableArrayList(laval,polytechnique_montréal);

    public void modulesButtonOnClick() throws IOException {
        menuPrincipal.setCenter(FXMLLoader.load(getClass().getResource("View/ListModules.fxml")));
    }
    public void internationalButtonOnClick() throws IOException{
        menuPrincipal.setCenter(FXMLLoader.load(getClass().getResource("View/CursusChoix.fxml")));
    }

    public void stageButtonOnClick() throws IOException {
        menuPrincipal.setCenter(FXMLLoader.load(getClass().getResource("View/DemandeStage.fxml")));
    }

    public void CurrentWishOnClick()throws IOException {
        menuPrincipal.setCenter(FXMLLoader.load(getClass().getResource("View/ChoixVoeuxEnCours.fxml")));
    }


    public void initialize(URL url, ResourceBundle resourceBundle) {
        universite.setItems(uni);
        universite.setCellFactory(lv -> new TestCell());
    }

    public void UniClicked() throws IOException {
        Stage currentStage = (Stage) universite.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/InformationsUniversite.fxml"))));
    }


}
