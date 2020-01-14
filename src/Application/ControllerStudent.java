package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.*;
import java.io.IOException;

public class ControllerStudent {

    public Button stages;
    public Button international;
    public Button modules;
    public BorderPane menuPrincipal;
    public Button startForm;
    public Button formInternship;
    public Button annulerButton;
    public Button postulerUni;
    public Hyperlink cursusVoeux;
    public Hyperlink stageVoeux;
    public Hyperlink moduleVoeux;
    public Button importdoc;
    public Button demandeEntretien;
    public Button envoyerentretien;


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

    public void startFormOnClick() throws IOException {
        Stage currentStage = (Stage) startForm.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/FormulaireDemandeStage.fxml"))));
    }

    public void formInternShipOnClick() throws IOException {
        Stage currentStage = (Stage) formInternship.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/ValiderDemandeStage.fxml"))));
    }

    public void goToMenu()throws IOException {
        Stage currentStage = (Stage) annulerButton.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/Menu.fxml"))));
    }


    public void ConsulterVoeuxButtonOnClick() throws IOException{

    }

    public void retourAjoutModuleButton() throws IOException{
        menuPrincipal.setCenter(FXMLLoader.load(getClass().getResource("View/ListModules.fxml")));
    }


    public void postulerUniOnClick() throws IOException {
        Stage currentStage = (Stage) postulerUni.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/DocumentsCursus.fxml"))));
    }

    public void retourUniOnClick() throws IOException {
        menuPrincipal.setCenter(FXMLLoader.load(getClass().getResource("View/CursusChoix.fxml")));
    }

    public void moduleVoeuxOnClick() throws IOException {
        Stage currentStage = (Stage) moduleVoeux.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/MaListeVoeux.fxml"))));
    }

    public void cursusVoeuxOnClick() throws IOException {
        Stage currentStage = (Stage) cursusVoeux.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/MaListeVoeux.fxml"))));
    }

    public void stageVoeuxOnClick() throws IOException {
        Stage currentStage = (Stage) stageVoeux.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/MaListeVoeux.fxml"))));
    }

    public void importdocOnAction() throws IOException {
        Stage currentStage = (Stage) importdoc.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/DocumentsCursus.fxml"))));
    }

    public void demandeEntretienOnAction() throws IOException {
        Stage currentStage = (Stage) demandeEntretien.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/DemandeEntretien.fxml"))));
    }

    public void envoyerentretienOnAction(ActionEvent actionEvent) throws IOException {
        Stage currentStage = (Stage) envoyerentretien.getScene().getWindow();
        currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/DemandeEntretienEnvoyee.fxml"))));
    }
}
