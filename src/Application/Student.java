package Application;

import javafx.beans.Observable;
import javafx.collections.ObservableList;

import java.util.Set;

public class Student {
    int id;
    String nom;
    String prenom;
    String cr;
    int absence;
    ObservableList<Note> listeNote;



    //constructor

    public Student(int id, String nom, String prenom, String cr, int absence,ObservableList<Note> listeNote) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cr = cr;
        this.listeNote = listeNote;
        this.absence = absence;
    }

    //getters & setters

    public int getAbsence() {
        return absence;
    }

    public void setAbsence(int absence) {
        this.absence = absence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }
}
