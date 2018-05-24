package enemies;

import enums.TreasureType;

public class Enemy {

    private String name;
    private int health;
    private int attack;
    private TreasureType treasure;

    public Enemy(String name, int health, int attack, TreasureType treasure){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.treasure = treasure;
    }

    public String getName() {
        return this.name;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getHealth() {
        return this.health;
    }

    public TreasureType getTreasure() {
        return this.treasure;
    }

    public void loseHealth(int amount) {
        this.health -= amount;
    }

}
