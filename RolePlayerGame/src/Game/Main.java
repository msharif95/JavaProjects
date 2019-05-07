package Game;

import java.util.Hashtable;
/**
 * Created by C1545823 on 29/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Hashtable<String, Room> roomHashtable = new Hashtable<>();
        Room r1 = new Room(0, "Hallway");
        Room r2 = new Room(1, "Office");
        Room r3 = new Room(2, "Lounge Room");
        Room r4 = new Room(3, "Canteen");
        Room r5 = new Room(4, "Lecture Theatre");

        r1.addExit(new Exit(1,"N", r2));
        r1.addExit(new Exit(3,"S", r4));
        r1.addExit(new Exit(4,"W", r5));
        r1.addExit(new Exit(2,"E", r3));

        r2.addExit(new Exit(0,"S", r1));
        r2.addExit(new Exit(4,"W", r5));
        r2.addExit(new Exit(2,"E", r3));

        r3.addExit(new Exit(0,"W", r1));
        r3.addExit(new Exit(2,"S", r4));

        r4.addExit(new Exit(2,"S", r3));
        r4.addExit(new Exit(0,"W", r1));

        r5.addExit(new Exit(0,"E", r1));

        roomHashtable.put("Hallway", r1);
        roomHashtable.put("Office", r2);
        roomHashtable.put("Lounge Room", r3);
        roomHashtable.put("Canteen", r4);
        roomHashtable.put("Lecture Theatre", r5);

        Player p = new Player(130,40,5,30,50,r1);

        GameEngine gameEngine = new GameEngine(roomHashtable, "Hallway", p);

        gameEngine.run();
    }
}
//NOTE: The game needs further improvements but the its working for now.