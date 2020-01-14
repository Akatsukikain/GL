package Application;

public class ModuleComplementaire {
    String name;
    boolean isUe;
    boolean file;

    public ModuleComplementaire(String name, boolean isUe, boolean file) {
        this.name = name;
        this.isUe = isUe;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public boolean isUe() {
        return isUe;
    }

    public boolean isFile() {
        return file;
    }
}
