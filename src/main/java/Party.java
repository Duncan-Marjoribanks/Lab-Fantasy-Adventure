import players.Dwarf;
import players.Player;

import java.util.ArrayList;

public class Party {

    private ArrayList<Player> members;

    public Party(){
        this.members = new ArrayList <>();
    }


    public int countMembers() {
        return this.members.size();
    }

    public void addPlayer(Player player) {
        this.members.add(player);
    }

    public void removePlayer(Player player) {
        this.members.remove(player);
    }
}
