package nodev.Model;

public class Room {
    private int number;
    private boolean reserved;

    public Room(int number, boolean reserved) {
        this.number = number;
        this.reserved = reserved;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isReserved() {
        return this.reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

}
