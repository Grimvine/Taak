/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taak;

import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author u0002531
 */
public class CellView extends Region {
    private Cell cell;

    public CellView(Cell cell) {
        this.cell = cell;
        update(cell);
    }
    
    public void update(Cell cellupdate) {
        Rectangle square = new Rectangle(10, 10);
        if(cellupdate.getDen()== -1){
            square.setFill(Color.web("#597C2B")); 
        }else if(cellupdate.getDen()==2){
            square.setFill(Color.web("#00FF00"));     
        }
        
        else{
            square.setFill(Color.web("#5c4033"));
        }

        //square.setStroke(Color.BLACK);
        getChildren().add(square);
    }
}
