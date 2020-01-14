package Application;

import javafx.scene.control.ListCell;


import javafx.scene.control.ListCell;

public class CellFactoryRDV extends ListCell<Rdv> {
    @Override
    protected void updateItem(Rdv rdv, boolean empty) {
        super.updateItem(rdv, empty);
        if (rdv != null){
            setText(rdv.getNom());
        }
    }
}


