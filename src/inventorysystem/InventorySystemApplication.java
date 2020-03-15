/*
* Name:  [your name here]
* Assignment:  [assignment name]
* Program: [your program name here]
* Date:  [assignment due date here]
    
* Description:
* [program description in your own words]
 */
package inventorysystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author nathan
 */
public class InventorySystemApplication extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLInventorySystem.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Inventory System");
        stage.setScene(scene);
        stage.show();
        
    }

}
