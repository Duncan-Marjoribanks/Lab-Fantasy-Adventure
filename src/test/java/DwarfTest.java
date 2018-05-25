import enemies.Enemy;
import enums.DwarfWeaponType;
import enums.PlayerArmourType;
import enums.TreasureType;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Enemy enemy1;

    @Before
    public void before() {
        dwarf = new Dwarf("Gimli", 6,8, PlayerArmourType.CHAINMAIL, DwarfWeaponType.AXE);
        enemy1 = new Enemy("Troll", 30, 6, TreasureType.GEMS);
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void canGethealth() {
        assertEquals(6, dwarf.getHealth());
    }

    @Test
    public void canGetBaseAttack() {
        assertEquals(8, dwarf.getBaseAttack());
    }

    @Test
    public void canGetTotalAttack() {
        assertEquals(15, dwarf.getTotalAttack());
    }

    @Test
    public void canLoseHealth() {
        dwarf.loseHealth(6);
        assertEquals(5, dwarf.getHealth());
    }

    @Test
    public void canFight() {
        dwarf.fight(enemy1);
        assertEquals(15, enemy1.getHealth());
        assertEquals(5, dwarf.getHealth());
    }


}
