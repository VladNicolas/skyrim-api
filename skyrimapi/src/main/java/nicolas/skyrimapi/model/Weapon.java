package nicolas.skyrimapi.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Weapon {

    @Id
    private int id;
    private String name;
    private String type;
    private int damage;
    private int weight;
    private int value;

    public Weapon() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getWeight() {
        return weight;
    }
    
    public int getValue() {
        return value;
    }
}