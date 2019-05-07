package Game;

/**
 * Created by C1545823 on 29/03/2016.
 */
public class Player extends Property{
    private Room currentRoom;

    public Player(int health, int damage, int numHealthPotions, int healthPotionHealAmmount, int healthPotionDropChance, Room currentRoom) {
        super(health, damage, numHealthPotions, healthPotionHealAmmount, healthPotionDropChance);
        this.currentRoom = currentRoom;
    }

    public void printPosition() {
        currentRoom.print();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}
