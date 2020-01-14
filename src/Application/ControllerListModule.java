package Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerListModule implements Initializable {
    public ListView<ModuleComplementaire> listModule;
    public Button AjoutModuleButton;


    ModuleComplementaire anglais = new ModuleComplementaire("Anglais",false,true);
    ModuleComplementaire sport = new ModuleComplementaire("Sport",false,false);
    ModuleComplementaire noyau = new ModuleComplementaire("Noyau",false,false);
    ModuleComplementaire resoloco = new ModuleComplementaire("Resoloco",false,false);

    ObservableList<ModuleComplementaire> module = FXCollections.observableArrayList(anglais,sport,noyau,resoloco);

    public void initialize(URL url, ResourceBundle resourceBundle) {
        listModule.setItems(module);
        listModule.setCellFactory(lv -> new ModuleListCell());
    }


    public void AjouterModuleOnClick() throws IOException {
        Stage currentStage = (Stage) AjoutModuleButton.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/AjoutModuleConfirmation.fxml"))));
    }
}
