import enums.DwarfWeaponType;
import enums.PlayerArmourType;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PartyTest {

    Party party;
    Dwarf dwarf1, dwarf2;

    @Before
    public void before(){
        party = new Party();
        dwarf1 = new Dwarf("Gimli", 6,8, PlayerArmourType.CHAINMAIL, DwarfWeaponType.AXE);
        dwarf2 = new Dwarf("Boromir",4,9, PlayerArmourType.LEATHER, DwarfWeaponType.MACE);
    }

    @Test
    public void canCountMembers() {
        assertEquals(0, party.countMembers());
    }

    @Test
    public void canAddPlayerToMembers() {
        party.addPlayer(dwarf1);
        assertEquals(1, party.countMembers());
    }

    @Test
    public void canRemovePlayerFromMembers() {
        party.addPlayer(dwarf1);
        party.removePlayer(dwarf1);
        assertEquals(0, party.countMembers());
    }


}
