package Game;

/**
 * Created by Mustafa Sharif.
 */
public class Exit {
    private int direction;
    private String description;
    private Room leadTo;

    public Exit(int direction,String description, Room leadTo) {
        this.direction = direction;
        this.description = description;
        this.leadTo = leadTo;
    }

    public int getDirection() {
        return direction;
    }

    public Room getLeadTo() {
        return leadTo;
    }

    public String getDescription() {
        return description;
    }
}
