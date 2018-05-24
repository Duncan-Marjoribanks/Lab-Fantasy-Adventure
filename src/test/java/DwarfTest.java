import enums.DwarfWeaponType;
import enums.PlayerArmourType;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf("Gimli", 6,8, PlayerArmourType.CHAINMAIL, DwarfWeaponType.AXE);
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void canGethealth() {
        assertEquals(6, dwarf.gethealth());
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
