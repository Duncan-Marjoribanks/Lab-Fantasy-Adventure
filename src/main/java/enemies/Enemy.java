package enemies;

import behaviours.Ifight;
import enums.TreasureType;
import players.Player;

public class Enemy implements Ifight{

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

    public void fight(Ifight player) {
        int playerAttack = player.callGetAttack();
        int enemyAttack = this.getAttack();
        player.callLoseHealth(enemyAttack);
        this.callLoseHealth(playerAttack);
    }


    public void callLoseHealth(int amount){
        this.loseHealth(amount);
    }

    public int callGetAttack() {
        return this.getAttack();
    }


}
