package players;

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

    public int gethealth() {
        return this.health;
    }

    public int getBaseAttack() {
        return this.baseAttack;
    }


    public void loseHealth(int amount) {
        this.health =- amount;
    }

}
