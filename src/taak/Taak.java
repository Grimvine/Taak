/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taak;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.*;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author beheerder
 */
public class Taak extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {       
        Map m = new Map(100,100);
        FXMLLoader lader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = lader.load();
        FXMLDocumentController controller = lader.getController();
        
        controller.setModel(m);
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
