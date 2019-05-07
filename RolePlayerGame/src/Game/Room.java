package Game;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Mustafa Sharif.
 */
public class Room {
    private int roomNo;
    private String description;
    private List<Exit> exits;

    public Room(int roomNo, String description) {
        this.roomNo = roomNo;
        this.description = description;
        this.exits = new ArrayList<>();
    }

    public void print() {
        System.out.println(this);
    }

    public void addExit(Exit aExit) {
        exits.add(aExit);
    }

    public Room getExitRoom(int direction) {
        for(int i = 0; i < exits.size(); i++) {
            if(exits.get(i).getDirection() == direction) {
                System.out.println(exits.get(i).getLeadTo());
                return exits.get(i).getLeadTo();
            }
        }
        System.out.println("You can not go that way. It's locked");
        return this;
    }


    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Exit> getExits() {
        return exits;
    }

    @Override
    public String toString() {
        return "Room no: " + this.roomNo + "\t" + "Description: " + this.description;
    }
}
