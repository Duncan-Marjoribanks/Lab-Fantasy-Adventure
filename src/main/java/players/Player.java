package players;

import behaviours.Ifight;
import enemies.Enemy;
import enums.PlayerArmourType;

public abstract class Player {

    private String name;
    private int health;
    private int baseAttack;
    private PlayerArmourType playerArmourType;

    public Player(String name, int health, int baseAttack, PlayerArmourType playerArmourType){
        this.name = name;
        this.health = health;
        this.baseAttack = baseAttack;
        this.playerArmourType = playerArmourType;
    }


    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getBaseAttack() {
        return this.baseAttack;
    }

    public int getArmour() {
        return this.playerArmourType.getHealthBonus();
    }


    public void loseHealth(int amount) {
        this.health -= (amount - this.getArmour());
    }


}
