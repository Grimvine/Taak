/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taak;

import javafx.scene.image.Image;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

/**
 *
 * @author Siebe
 */
public class AnimalView extends Region {
    private Animal animal;

    public AnimalView(Animal animal) {
        this.animal = animal;
        update(animal);
    }
    
    public void update(Animal animalupdate) {
        Circle dot = new Circle(2.5);
        if(animalupdate.getSpecies()== "Fox"){
            dot.setFill(Color.RED); 
        }
        else if(animalupdate.getSpecies()== "Rabbit"){
            dot.setFill(Color.WHITE); 
        }
        else if(animalupdate.getSpecies()== "Plant"){
            dot.setFill(Color.BLUE); 
        }
        //dot.setStroke(Color.BLACK);
        getChildren().add(dot);
    }
}
