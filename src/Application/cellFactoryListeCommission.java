package Application;

import javafx.scene.control.ListCell;

public class cellFactoryListeCommission extends ListCell<Commission> {
    @Override
    protected void updateItem(Commission commission, boolean empty) {
        super.updateItem(commission, empty);
        if (commission != null){
            setText(commission.getNom());
        }
    }
}
