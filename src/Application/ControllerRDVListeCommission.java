package Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerRDVListeCommission implements Initializable {
    public ObservableList liste = FXCollections.observableArrayList();
    //public Button valider;
    //Génération d'infos bidon
    public ListView listeRdv;

    //infos bidon
    public void loadDataCommission(){
        //empecher selection multiple
        listeRdv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        //jeux de donnee
        TestRemplissage data = new TestRemplissage();
        listeRdv.setItems(data.getListeCom());
        listeRdv.setCellFactory(listView -> new cellFactoryListeCommission());
        //recup commission selec
        listeRdv.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Commission commission = (Commission) listeRdv.getSelectionModel().getSelectedItem();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("View/RDVokCommission.fxml"));
                Scene scene = null;
                try {
                    scene = new Scene(loader.load());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ControllerRdvokCommission c = loader.getController();
                c.fillList(commission);
                Stage currentStage = (Stage) listeRdv.getScene().getWindow();
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
