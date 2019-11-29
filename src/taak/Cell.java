package taak;
import java.util.ArrayList;

class Cell {
    private int animalCount;
    private int den;
    private Location location;
    private ArrayList<Integer> animals;
    
    public Cell(int x, int y, int animalCount, int den) {
        location = new Location(x,y);
        this.animalCount = animalCount;
        this.den = den;
        animals = new ArrayList<>();
        for (int i=0;i<animalCount;i++){
            animals.add(0);
        }
    }
     
    public void raiseAnimalsOnIndex(int index){
        //animals[index] = animals[index] + 1;
        animals.set(index,animals.get(index)+1);
    }
    
    public ArrayList<Integer> toArray(){
        return animals;
    }
    
    public int getDen(){
        return den;
    }
    
}
