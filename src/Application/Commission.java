package Application;

import javafx.beans.Observable;
import javafx.collections.ObservableList;

public class Commission {
    ObservableList<Student> students;
    String nom;
    ObservableList<Rdv> rdv;

    public Commission(ObservableList<Student> students, String nom) {
        this.students = students;
        this.nom = nom;
    }

    public ObservableList<Student> getStudents() {
        return students;
    }

    public void setStudents(ObservableList<Student> students) {
        this.students = students;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ObservableList<Rdv> getRdv() {
        return rdv;
    }

    public void setRdv(ObservableList<Rdv> rdv) {
        this.rdv = rdv;
    }
}