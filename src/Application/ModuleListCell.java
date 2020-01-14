package Application;

import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class ModuleListCell extends ListCell<ModuleComplementaire> {
    //private final ImageView doc = new ImageView();
    //Image image = new Image(Main.class.getResourceAsStream("images/tromb.jpg"));
    //private final AnchorPane content = new AnchorPane();

    /*
    public void ModuleListCell() {
        doc.setFitWidth(50);
        doc.setFitHeight(50);
        doc.setPreserveRatio(true);
        doc.setSmooth(true);
        doc.setCache(true);
        content.getChildren().add(doc);
    }
*/
    protected void updateItem(ModuleComplementaire item, boolean empty) {
        //setContentDisplay(ContentDisplay.RIGHT);
        super.updateItem(item, empty);
        //setGraphic(null);
        setText(null);
        if (!empty && item != null) {
            if (item.isFile() == true) {
                final String text = String.format("%s (document à fournir)", item.getName());
                //doc.setImage(image);
                setText(text);
                // setGraphic(content);
            } else {
                final String text = String.format("%s ", item.getName());
                setText(text);
            }
        }
    }
}

