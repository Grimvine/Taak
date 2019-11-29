package taak;

import java.util.Random;

public class Animal {
    
    private int speed, nutrition, range, sleepTime, preferences, food, sprintSpeed, reproductionSpeed, hierarchyIndex;
    private double satisfaction;
    private String species,gender;
    private Location den, location;

    public Animal(String species, Location den, int hierarchyIndex) {
        Random rand = new Random();
        this.species = species;
        this.hierarchyIndex = hierarchyIndex;
        if ("Fox".equals(species)) {
            speed = rand.nextInt(2) + 8;
            nutrition = rand.nextInt(2) + 8;
            range = rand.nextInt(2) + 8;
            sleepTime = rand.nextInt(2) + 8;
            preferences = rand.nextInt(2) + 8;
            food = rand.nextInt(2) + 8;
            sprintSpeed = rand.nextInt(2) + 8;
            reproductionSpeed = rand.nextInt(2) + 8;
            satisfaction = 0.2 * rand.nextDouble() + 2;
            if (rand.nextInt(1) == 1) {
                gender = "male";
            } else {
                gender = "female";
            }
            this.den = den;
            location = den;
                    
    
        } else if ("Rabbit".equals(species)) {
            speed = rand.nextInt(2) + 8;
            nutrition = rand.nextInt(2) + 8;
            range = rand.nextInt(2) + 8;
            sleepTime = rand.nextInt(2) + 8;
            preferences = rand.nextInt(2) + 8;
            food = rand.nextInt(2) + 8;
            sprintSpeed = rand.nextInt(2) + 8;
            reproductionSpeed = rand.nextInt(2) + 8;
            satisfaction = 0.2 * rand.nextDouble() + 2;
            if (rand.nextInt(1) == 1) {
                gender = "male";
            } else {
                gender = "female";
            }
            this.den = den;
            location = den;
            
        
        } else if ("Plant".equals(species)) {
             speed = rand.nextInt(2) + 8;
             nutrition = rand.nextInt(2) + 8;
             range = rand.nextInt(2) + 8;
             sleepTime = rand.nextInt(2) + 8;
             preferences = rand.nextInt(2) + 8;
             food = rand.nextInt(2) + 8;
             sprintSpeed = rand.nextInt(2) + 8;
             reproductionSpeed = rand.nextInt(2) + 8;
             satisfaction = 0.2 * rand.nextDouble() + 2;
             if (rand.nextInt(1) == 1) {
                 gender = "male";
             } else {
                 gender = "female";
             }
             this.den = den;
             location = den;
        }
    }
    
    public Location getLocation() {
        return location;
    }
    
    public int getX() {
        return location.getX();
    }  
    
    public int getY() {
        return location.getY();
    }
        
    
    public String getSpecies() {
        return species;
    }
    
    public int getHierarchyIndex() {
        return hierarchyIndex;
    }
}
