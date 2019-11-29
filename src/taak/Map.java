package taak;
import java.util.*;

public class Map {
    private ArrayList<String> hierarchy;
    private ArrayList<ArrayList<Location>> dens;
    private ArrayList<Integer> densCount;
    private ArrayList<Integer> start;
    private ArrayList<ArrayList<Cell>> world; 
    private ArrayList<Animal> animals;   
    private int width, height;
    
    public Map(int width, int height) {
        hierarchy = new ArrayList<>();
        hierarchy.add("Fox");
        hierarchy.add("Rabbit");
        hierarchy.add("Plant");
        densCount = new ArrayList<>();
        densCount.add(100);
        densCount.add(9);
        densCount.add(2);
        start = new ArrayList<>();
        start.add(1000);
        start.add(7);
        start.add(8);
              
        this.width = width;
        this.height = height;
        
        Random rand = new Random();
        
        world = new ArrayList<>();
        for (int i=0;i<width;i++) {
            world.add(new ArrayList<Cell>());
            for (int j=0;j<height;j++) {               
                world.get(i).add(new Cell(i,j,hierarchy.size(),-1));
            }
        }

        
                dens = new ArrayList<>();
        for(int i=0; i<hierarchy.size();i++) { 
            dens.add(new ArrayList<Location>());
            for (int j=0; j<densCount.get(i);j++) {
                int randomX = rand.nextInt(width);
                int randomY = rand.nextInt(height);
                dens.get(i).add(new Location(randomX,randomY));
                world.get(randomX).set(randomY,new Cell(randomX,randomY,hierarchy.size(),i));
                System.out.println(randomX+","+randomY);
            }
        }
        
        animals = new ArrayList<Animal>();
        for(int i=0; i<hierarchy.size();i++) {
            for (int j=0; j<start.get(i);j++) {
                Animal a = new Animal(hierarchy.get(i), dens.get(i).get(rand.nextInt(dens.get(i).size())),i);
                animals.add(a);    
                world.get(a.getX()).get(a.getY()).raiseAnimalsOnIndex(i);
            }
        } 
    }
  
    public ArrayList<String> gethierarchy() {
        return hierarchy;
    }
    
    public void update() {
        System.out.println("hallo");
    }
    
    public void toText(){
        for (int i =0;i<world.size();i++){
            for (int j =0;j<world.get(i).size();j++){
                System.out.println(world.get(i).get(j).toArray());
            }
        }
    }
    
    public ArrayList<ArrayList<Cell>> getWorld() {
        return world;
    }
    public ArrayList<Animal> getAnimals(){
        return animals;
    }
    
    
    //test
    //yee
    
    
}
