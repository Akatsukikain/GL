package Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerListeCommission implements Initializable {
    public ObservableList liste = FXCollections.observableArrayList();
    //public Button valider;
    //Génération d'infos bidon
    public ListView listeCommission;

    //infos bidon
    public void loadDataCommission(){
        //empecher selection multiple
        listeCommission.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        //jeux de donnee
        TestRemplissage data = new TestRemplissage();
        listeCommission.setItems(data.getListeCom());
        listeCommission.setCellFactory(listView -> new cellFactoryListeCommission());
        //recup commission selec
        listeCommission.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Commission commission = (Commission) listeCommission.getSelectionModel().getSelectedItem();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("View/CandidaturesCommission.fxml"));
                Scene scene = null;
                try {
                    scene = new Scene(loader.load());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ControllerListeCandidatures clc = loader.getController();
                clc.fillTableView(commission);
                Stage currentStage = (Stage) listeCommission.getScene().getWindow();
                currentStage.setScene(scene);

            }
        });
        /*
        listeCommission.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Commission commission = (Commission) listeCommission.getSelectionModel().getSelectedItem();
                Stage currentStage = (Stage) listeCommission.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader();
                try {
                    loader.setLocation(new URL("ListeCandidatures.fxml"));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                loader.setController(new ControllerListeCandidatures(commission));
                currentStage.setScene(new Scene(loader.));
            }
        });*/
    }
    /*
    public void validerOnclick() throws IOException {
        Commission commission = (Commission) listeCommission.getSelectionModel().getSelectedItem();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CandidaturesCommission.fxml"));
        Scene scene = new Scene(loader.load());
        ControllerListeCandidatures clc = loader.getController();
        clc.fillTableView(commission);
        Stage currentStage = (Stage) valider.getScene().getWindow();
        currentStage.setScene(scene);

    }*/
    public void loadDataCandidatures(){

    }
    public void loadDataStudent(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadDataCommission();
    }
}
