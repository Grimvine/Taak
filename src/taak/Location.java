package taak;
import java.lang.Math;

public class Location {
    private int x, y; 
    
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {  
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setx(int x){
        this.x = x;
    }
        
    public void sety(int y){
        this.y = y;
    }
    
    public double afstand(Location loc2){
        return Math.sqrt(Math.pow(x-loc2.getX(), 2)+Math.pow(y-loc2.getY(),2));
    }
}
