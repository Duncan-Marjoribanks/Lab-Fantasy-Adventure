import enemies.Enemy;
import enums.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EnemyTest {

    Enemy enemy1;

    @Before
    public void before() {
        enemy1 = new Enemy("Troll", 30, 5, TreasureType.GEMS);
    }

    @Test
    public void canGetName() {
        assertEquals("Troll", enemy1.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(30, enemy1.getHealth());
    }

    @Test
    public void canGetAttack() {
        assertEquals(5, enemy1.getAttack());
    }

    @Test
    public void canGetTreasureType() {
        assertEquals(TreasureType.GEMS, enemy1.getTreasure());
    }

    @Test
    public void canLoseHealth() {
        enemy1.loseHealth(10);
        assertEquals(20, enemy1.getHealth());
    }

}
