package enums;

public enum DwarfWeaponType {

    AXE (7),
    MACE (9);

    private final int attackBonus;

    DwarfWeaponType(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public int getAttackBonus() {
        return attackBonus;
    }
}
