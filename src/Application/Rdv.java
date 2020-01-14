package Application;

import java.util.Date;

public class Rdv {
    public int id;
    public String prenom;
    public String nom;
    public String date;

    public Rdv(int id, String prenom, String nom, String date) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
