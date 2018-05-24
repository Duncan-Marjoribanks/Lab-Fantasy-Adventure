package players;

public abstract class Player {

    private String name;
    private int health;
    private int baseAttack;

    public Player(String name, int health, int baseAttack){
        this.name = name;
        this.health = health;
        this.baseAttack = baseAttack;
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
}
