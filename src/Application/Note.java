package Application;

public class Note {
    String matiere;
    int note;

    public Note(String matiere, int note) {
        this.matiere = matiere;
        this.note = note;
    }

    //getters & setters
    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
