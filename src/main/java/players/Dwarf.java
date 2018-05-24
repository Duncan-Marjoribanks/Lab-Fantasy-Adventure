package players;

import enums.DwarfWeaponType;

public class Dwarf extends Player {

    private DwarfWeaponType dwarfWeaponType;

    public Dwarf(String name, int health, int baseAttack, DwarfWeaponType dwarfWeaponType){
        super(name, health, baseAttack);
        this.dwarfWeaponType = dwarfWeaponType;
    }


    public int getTotalAttack() {
        return this.getBaseAttack() + dwarfWeaponType.getAttackBonus();
    }


}
