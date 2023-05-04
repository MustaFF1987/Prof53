package lesson10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PlayerTester {
    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();
        players.add(new Player(11,"Mike"));
        players.add(new Player(12,"Misha"));
        players.add(new Player(11,"Galina"));

    // System.out.println(players.size());
    // System.out.println(players);

        Iterator<Player> playersIterator = players.iterator();

        while (playersIterator.hasNext())
            System.out.println(playersIterator.next());

        // ====================================

        for (Player p: players) {
            System.out.println("ForEach "+ p);
        }
    }
}
