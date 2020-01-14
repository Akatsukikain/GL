package Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class ControllerRDVCommission implements Initializable{

    public ListView listeRDV;
    public Button valider;
    //load data
    public Commission commission;
    public BorderPane menuPrincipal;

    /*
    public void setCommission(Commission commission) {
        this.commission = commission;
    }
*/


    public void fillList(Commission commission){
        ObservableList<Rdv> listeRdv = commission.getRdv();
        listeRDV.setItems(listeRdv);
        listeRDV.setCellFactory(listeRDV -> new CellFactoryRDV());


    }

    public void retourOnClick() {

    }
    public void systemeAideOncClick(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //TestRemplissage testRemplissage = new TestRemplissage();


        //listeCandidatures.setItems(testRemplissage.getListeCom().get(1).getStudents());

    }

    public void fillTable() {
        /*
        TestRemplissage testRemplissage = new TestRemplissage();
        listeRDV.setItems(testRemplissage.getListeCom().get(1).getStudents());
        */

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
