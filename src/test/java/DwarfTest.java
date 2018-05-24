import enums.DwarfWeaponType;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf("Gimli", 6,8, DwarfWeaponType.AXE);
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void canGetHealth() {
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

}
