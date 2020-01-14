package Application;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerSystemeAide implements Initializable {

    public TableView<Student> classementGeneral;
    public TableView<Student> classementResultat;
    public TableView<Student> classementAssiduite;
    public TableView<Student> classementNote;

    //classement général
    public TableColumn idGeneral;
    public TableColumn nomGeneral;
    public TableColumn prenomGeneral;


    //classement résultat
    public TableColumn idResultat;
    public TableColumn nomResultat;
    public TableColumn prenomResultat;

    //classement assiduité
    public TableColumn idAssiduite;
    public TableColumn nomAssiduite;
    public TableColumn prenomAssiduite;

    //classement note
    public TableColumn idNote;
    public TableColumn nomNote;
    public TableColumn prenomNote;

    public BorderPane menuPrincipal;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TestRemplissage test = new TestRemplissage();

        nomGeneral.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomGeneral.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        idGeneral.setCellValueFactory(new PropertyValueFactory<>("id"));

        nomAssiduite.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomAssiduite.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        idAssiduite.setCellValueFactory(new PropertyValueFactory<>("id"));

        nomResultat.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomResultat.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        idResultat.setCellValueFactory(new PropertyValueFactory<>("id"));

        nomNote.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomNote.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        idNote.setCellValueFactory(new PropertyValueFactory<>("id"));


        classementGeneral.setItems(test.getC1().getStudents());
        classementResultat.setItems(test.getC1().getStudents());
        classementAssiduite.setItems(test.getC1().getStudents());
        classementNote.setItems(test.getC1().getStudents());
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
