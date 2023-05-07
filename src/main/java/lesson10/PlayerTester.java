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
        players.add(new Player(15,"Alexander"));
        players.add(new Player(1,"Natasha"));
        players.add(new Player(25,"Alexander"));

    // System.out.println(players.size());
    // System.out.println(players);

        Iterator<Player> playersIterator = players.iterator();

        while (playersIterator.hasNext())
            System.out.println(playersIterator.next());

        // ====================================

        for (Player p: players) {
            System.out.println("ForEach "+ p);
        }
// неправильный подход
//        for (Player p: players)
//        {
//            if(p.getName().equals("Alexander"))
//                players.remove(p);
//        }
        // Remove "Alexander"
        Iterator<Player> toRemove = players.iterator();
        while (toRemove.hasNext())
        {
            Player p = toRemove.next();
            if(p.getName().equals("Alexander"))
                toRemove.remove();
        }
        System.out.println(players);

    }
}
