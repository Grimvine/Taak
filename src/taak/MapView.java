/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taak;

import java.util.ArrayList;
import javafx.scene.layout.Region;

/**
 *
 * @author u0002531
 */
public class MapView extends Region {
    private Map map;

    public MapView(Map map) {
        this.map = map;
        update();
    }
    
    public void update() {
        getChildren().clear();
        ArrayList<ArrayList<Cell>> world = map.getWorld();
        for(int i=0; i<world.size();i++) {
            for (int j=0; j<world.get(i).size();j++) {
               CellView Cv = new CellView(world.get(i).get(j));
                Cv.setTranslateX(i*10);
                Cv.setTranslateY(j*10);              
                getChildren().add(Cv); 
            }
        }
        ArrayList<Animal> animals = map.getAnimals();
        for(int i=0; i<animals.size();i++){
            AnimalView Av = new AnimalView(animals.get(i));
            Av.setTranslateX(animals.get(i).getX()*10+5);
            Av.setTranslateY(animals.get(i).getY()*10+5);
            getChildren().add(Av);
        
        }
        }
    }