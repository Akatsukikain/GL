package Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerAuthentification {

    public TextField email;
    public PasswordField pass;
    public String password;
    public String e_mail;
    public Button connexion;
    public Button closeButton;

    //Méthode pour gérer les connexions à l'application
    public void ConnexionButtonOnClick() throws IOException {
        e_mail= email.getText();
        password = pass.getText();
        System.out.println(e_mail);
        System.out.println(password);
        Stage currentStage = (Stage) connexion.getScene().getWindow();
        if (e_mail.equals("student") && password.equals("1234")) {
            currentStage.hide();
            Stage homestage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("View/Menu.fxml"));
            homestage.setScene(new Scene(root, 800, 400));
            homestage.setTitle("ERip");
            homestage.show();
        }else if (e_mail.equals("staff") && password.equals("1234")){
            currentStage.hide();
            Stage homestage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("View/MenuCommission.fxml"));
            homestage.setScene(new Scene(root, 800, 400));
            homestage.setTitle("ERip");
            homestage.show();
        }else{
            Stage pop = new Stage();
            pop.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/ConnexionPopUp.fxml"))));
            pop.show();
        }

    }

    public void closeButtonOnClick() {
        Stage currentStage = (Stage) closeButton.getScene().getWindow();
        currentStage.hide();
    }

    public void forgetPassHyperLinkOnClick() throws IOException {
        Stage pop = new Stage();
        pop.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/MotDePasseOubliePopUp.fxml"))));
        pop.show();
    }
}
