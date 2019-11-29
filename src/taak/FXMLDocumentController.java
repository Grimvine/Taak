/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taak;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


/**
 *
 * @author beheerder
 */
public class FXMLDocumentController  {
    
    @FXML
    private AnchorPane pane;
    
    @FXML
    private Map map;
    @FXML
    private MapView view;
    @FXML
    private ArrayList<Animal> animals;

    void initialize() {
       } 
        // TODO
  
   
    public void setModel(Map map) {
        this.map = map;
        view = new MapView(map);
        pane.getChildren().add(view);
    }
    public void start(){
          System.out.println("testStart");

    }
}
    