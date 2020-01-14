package Application;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Set;

public class TestRemplissage {

    ObservableList<Commission> listeCom;
    ObservableList<Rdv> listeRdv;
    Commission c1;
    Commission c2;
    Commission c3;
    public TestRemplissage() {
        //Compte-rendu

        String cr = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Quis enim lobortis scelerisque fermentum dui faucibus in. At tellus at urna condimentum mattis. " +
                "Porttitor rhoncus dolor purus non enim. Eget duis at tellus at urna. Aliquet sagittis id consectetur " +
                "purus ut. Cursus turpis massa tincidunt dui ut ornare lectus sit amet. Egestas quis ipsum suspendisse " +
                "ultrices gravida dictum fusce ut. Pulvinar pellentesque habitant morbi tristique senectus. " +
                "Elit pellentesque habitant morbi tristique.";



        //Notes
        Note math1 = new Note("Mathématiques", 17);
        Note math2 = new Note("Mathématiques", 16);
        Note math3 = new Note("Mathématiques", 8);
        Note math4 = new Note("Mathématiques", 12);
        Note math5 = new Note("Mathématiques", 4);
        Note math6 = new Note("Mathématiques", 4);
        Note math7 = new Note("Mathématiques", 4);
        Note math8 = new Note("Mathématiques", 14);
        Note math9 = new Note("Mathématiques", 4);
        Note math10 = new Note("Mathématiques", 4);


        Note anglais1 = new Note("Anglais", 12);
        Note anglais2 = new Note("Anglais", 13);
        Note anglais3 = new Note("Anglais", 14);
        Note anglais4 = new Note("Anglais", 15);
        Note anglais5 = new Note("Anglais", 16);
        Note anglais6 = new Note("Anglais", 17);
        Note anglais7 = new Note("Anglais", 18);
        Note anglais8 = new Note("Anglais", 19);
        Note anglais9 = new Note("Anglais", 20);
        Note anglais10 = new Note("Anglais", 20);

        Note physique1 = new Note("Physique", 6);
        Note physique2 = new Note("Physique", 16);
        Note physique3 = new Note("Physique", 15);
        Note physique4 = new Note("Physique", 19);
        Note physique5 = new Note("Physique", 3);
        Note physique6 = new Note("Physique", 3);
        Note physique7 = new Note("Physique", 13);
        Note physique8 = new Note("Physique", 3);
        Note physique9 = new Note("Physique", 12);
        Note physique10 = new Note("Physique", 3);


        Note gestion1 = new Note("Gestion", 6);
        Note gestion2 = new Note("Gestion", 7);
        Note gestion3 = new Note("Gestion", 8);
        Note gestion4 = new Note("Gestion", 9);
        Note gestion5 = new Note("Gestion", 10);
        Note gestion6 = new Note("Gestion", 11);
        Note gestion7 = new Note("Gestion", 12);
        Note gestion8 = new Note("Gestion", 13);
        Note gestion9 = new Note("Gestion", 14);
        Note gestion10 = new Note("Gestion", 15);

        Note info1 = new Note("Informatique", 5);
        Note info2 = new Note("Informatique", 6);
        Note info3 = new Note("Informatique", 7);
        Note info4 = new Note("Informatique", 8);
        Note info5 = new Note("Informatique", 9);
        Note info6 = new Note("Informatique", 10);
        Note info7 = new Note("Informatique", 11);
        Note info8 = new Note("Informatique", 12);
        Note info9 = new Note("Informatique", 13);
        Note info10 = new Note("Informatique", 14);

        ObservableList<Note> listeNote1 = FXCollections.observableArrayList();
        ObservableList<Note> listeNote2 = FXCollections.observableArrayList();
        ObservableList<Note> listeNote3 = FXCollections.observableArrayList();
        ObservableList<Note> listeNote4 = FXCollections.observableArrayList();
        ObservableList<Note> listeNote5 = FXCollections.observableArrayList();
        ObservableList<Note> listeNote6 = FXCollections.observableArrayList();
        ObservableList<Note> listeNote7 = FXCollections.observableArrayList();
        ObservableList<Note> listeNote8 = FXCollections.observableArrayList();
        ObservableList<Note> listeNote9 = FXCollections.observableArrayList();
        ObservableList<Note> listeNote10 = FXCollections.observableArrayList();

        listeNote1.addAll(math1,physique1,anglais1,gestion1);
        listeNote2.addAll(math2,physique2,anglais2,gestion2);
        listeNote3.addAll(math3,physique3,anglais3,gestion3);
        listeNote4.addAll(math4,physique4,anglais4,gestion4);
        listeNote5.addAll(math5,physique5,anglais5,gestion5);
        listeNote6.addAll(math6,physique6,anglais6,gestion6);
        listeNote7.addAll(math7,physique7,anglais7,gestion7);
        listeNote8.addAll(math8,physique8,anglais8,gestion8);
        listeNote9.addAll(math9,physique9,anglais9,gestion9);
        listeNote10.addAll(math10,physique10,anglais10,gestion10);


        Student s1 = new Student(1,"nom1", "prenom1", cr, 8, listeNote1);
        Student s2 = new Student(2,"nom2", "prenom2", cr, 7, listeNote2);
        Student s3 = new Student(3,"nom3", "prenom3", cr, 5, listeNote3);
        Student s4 = new Student(4,"nom4", "prenom4", cr, 2, listeNote4);
        Student s5 = new Student(5,"nom5", "prenom5", cr, 1, listeNote5);
        Student s6 = new Student(6,"nom6", "prenom6", cr, 0, listeNote6);

        Rdv rdv1 = new Rdv(2, "prenom2","nom2", "date1");
        Rdv rdv5 = new Rdv(5, "prenom5","nom5", "date2");
        listeRdv = FXCollections.observableArrayList();
        listeRdv.addAll(rdv1,rdv5);

        ObservableList<Student> listeEtu = FXCollections.observableArrayList();
        listeEtu.addAll(s1,s2,s3,s4,s5,s6);

        c1 = new Commission(listeEtu,"Mathématiques");
        c2 = new Commission(listeEtu,"Anglais");
        c3 = new Commission(listeEtu,"Informatique");

        c1.setStudents(listeEtu);
        c2.setStudents(listeEtu);
        c3.setStudents(listeEtu);

        c1.setRdv(listeRdv);
        c2.setRdv(listeRdv);
        c3.setRdv(listeRdv);

        listeCom = FXCollections.observableArrayList();
        listeCom.addAll(c1,c2,c3);
    }

    public ObservableList<Commission> getListeCom() {
        return listeCom;
    }

    public void setListeCom(ObservableList<Commission> listeCom) {
        this.listeCom = listeCom;
    }

    public Commission getC1() {
        return c1;
    }

    public void setC1(Commission c1) {
        this.c1 = c1;
    }

    public Commission getC2() {
        return c2;
    }

    public void setC2(Commission c2) {
        this.c2 = c2;
    }

    public Commission getC3() {
        return c3;
    }

    public void setC3(Commission c3) {
        this.c3 = c3;
    }
}
