package players;

import behaviours.Ifight;
import enums.DwarfWeaponType;
import enums.PlayerArmourType;

public class Dwarf extends Player implements Ifight{

    private DwarfWeaponType dwarfWeaponType;

    public Dwarf(String name, int health, int baseAttack, PlayerArmourType playerArmourType, DwarfWeaponType dwarfWeaponType){
        super(name, health, baseAttack, playerArmourType);
        this.dwarfWeaponType = dwarfWeaponType;
    }


    public int getTotalAttack() {
        return this.getBaseAttack() + dwarfWeaponType.getAttackBonus();
    }

    public void fight(Ifight enemy){
        int enemyAttack = enemy.callGetAttack();
        int playerAttack = this.getTotalAttack();
        enemy.callLoseHealth(playerAttack);
        this.callLoseHealth(enemyAttack);
    }

    public void callLoseHealth(int amount){
        this.loseHealth(amount);
    }

    public int callGetAttack() {
        return this.getTotalAttack();
    }


}
