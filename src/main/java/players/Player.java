package players;

import enums.PlayerArmourType;

public abstract class Player {

    private String name;
    private int baseHealth;
    private int baseAttack;
    private PlayerArmourType playerArmourType;

    public Player(String name, int baseHealth, int baseAttack, PlayerArmourType playerArmourType){
        this.name = name;
        this.baseHealth = baseHealth;
        this.baseAttack = baseAttack;
        this.playerArmourType = playerArmourType;
    }


    public String getName() {
        return this.name;
    }

    public int getBaseHealth() {
        return this.baseHealth;
    }

    public int getBaseAttack() {
        return this.baseAttack;
    }

    public int getTotalHealth() {
        return this.getBaseHealth() + playerArmourType.getHealthBonus();
    }
}
