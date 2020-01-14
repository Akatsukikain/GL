package Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerListeCandidatures implements Initializable{

    public TableView<Student> listeCandidatures;
    public TableColumn identifiant;
    public TableColumn prenom;
    public TableColumn nom;
    //load data
    public Commission commission;
    public Button valider;
    public BorderPane menuPrincipal;
    /*
    public void setCommission(Commission commission) {
        this.commission = commission;
    }
*/


    public void systemAide() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View/systemeAideCommission.fxml"));
        Scene scene = new Scene(loader.load());
        //ControllerRDVCommission c = loader.getController();
        //c.fillList(commission);
        Stage currentStage = (Stage) listeCandidatures.getScene().getWindow();
        currentStage.setScene(scene);
    }


    public void fillTableView(Commission commission){
        this.commission = commission;
        ObservableList<Student> listeEtu = commission.getStudents();
        listeCandidatures.setItems(listeEtu);

    }
    public void rdvButtonOnCLick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View/RDVCommission.fxml"));
        Scene scene = new Scene(loader.load());
        ControllerRDVCommission c = loader.getController();
        c.fillList(commission);
        Stage currentStage = (Stage) listeCandidatures.getScene().getWindow();
        currentStage.setScene(scene);
    }

    public void retourOnClick() {


    }
    public void systemeAideOncClick(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //colonne id
        identifiant.setCellValueFactory(new PropertyValueFactory<>("id"));
        //colonne nom
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        //colonne prénom
        prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        TestRemplissage testRemplissage = new TestRemplissage();

        //listeCandidatures.setItems(testRemplissage.getListeCom().get(1).getStudents());

    }

    public void fillTable() {
        TestRemplissage testRemplissage = new TestRemplissage();
        listeCandidatures.setItems(testRemplissage.getListeCom().get(1).getStudents());
    }

    public void commissionOnClick() throws IOException {
        menuPrincipal.setCenter(FXMLLoader.load(getClass().getResource("View/ListeCommission.fxml")));
        System.out.println("Code pas vu");

    }
    public void rdvOnClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        menuPrincipal.setCenter(FXMLLoader.load(getClass().getResource("View/RDVListeCommission.fxml")));
        System.out.println("Code pas vu");
    }
}
