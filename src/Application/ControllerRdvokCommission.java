package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerRdvokCommission implements Initializable {
    public TableView<Rdv> listeRdv;
    public TableColumn nom;
    public TableColumn prenom;
    public TableColumn date;

    public Commission commission;
    public Button button;
    public BorderPane menuPrincipal;




    public void fillList(Commission commission){
        listeRdv.setItems(commission.getRdv());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //colonne id
        //identifiant.setCellValueFactory(new PropertyValueFactory<>("id"));
        //colonne nom
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        //colonne prénom
        prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        //date
        date.setCellValueFactory(new PropertyValueFactory<>("date"));




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

    public void retourOnClick() {
    }
}
