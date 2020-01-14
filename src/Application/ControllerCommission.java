package Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerCommission {


    public Button commission;
    public Button rdv;
    public BorderPane menuPrincipal;
    public Button closeButton;





    public void closeButtonOnClick() throws IOException {
        Stage currentStage = (Stage) closeButton.getScene().getWindow();
        currentStage.hide();
    }
    public void commissionOnClick() throws IOException {
        menuPrincipal.setCenter(FXMLLoader.load(getClass().getResource("View/ListeCommission.fxml")));
        System.out.println("Code pas vu");

    }
    public void rdvOnClick() throws IOException {
        menuPrincipal.setCenter(FXMLLoader.load(getClass().getResource("View/RDVListeCommission.fxml")));
        System.out.println("Code pas vu");
    }
    public void retourOnClick(){

    }
    public void systemeAideOncClick(){

    }



}
