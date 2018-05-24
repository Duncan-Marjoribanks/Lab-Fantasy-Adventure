package enums;

public enum PlayerArmourType {

    LEATHER(3),
    CHAINMAIL(5),
    PLATE(10);

    private final int healthBonus;

    PlayerArmourType(int healthBonus){
        this.healthBonus = healthBonus;
    }

    public int getHealthBonus() {
        return this.healthBonus;
    }
}
