package players;

import enums.DwarfWeaponType;
import enums.PlayerArmourType;

public class Dwarf extends Player {

    private DwarfWeaponType dwarfWeaponType;

    public Dwarf(String name, int baseHealth, int baseAttack, PlayerArmourType playerArmourType, DwarfWeaponType dwarfWeaponType){
        super(name, baseHealth, baseAttack, playerArmourType);
        this.dwarfWeaponType = dwarfWeaponType;
    }


    public int getTotalAttack() {
        return this.getBaseAttack() + dwarfWeaponType.getAttackBonus();
    }


}
