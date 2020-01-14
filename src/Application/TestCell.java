package Application;

import javafx.scene.control.ListCell;

public class TestCell extends ListCell<Test> {

    protected void updateItem(Test item, boolean empty) {
        super.updateItem(item, empty);
        setText(null);
        if (!empty && item != null) {
            final String text = String.format("%s ", item.getName());
            setText(text);
        }
    }
}
