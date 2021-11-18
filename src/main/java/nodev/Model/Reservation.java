package nodev.Model;

import java.util.Date;
import java.util.List;

public class Reservation {
    private int id;
    private Guest guest;
    private Room room;
    private Date entryDate;
    private Date departureDate;
    private HotelPackage hotelPackage;
    private List<Request> requests;

    public Reservation(int id, Guest guest, Room room, Date entryDate, Date departureDate, HotelPackage hotelPackage) {
        this.id = id;
        this.guest = guest;
        this.room = room;
        this.entryDate = entryDate;
        this.departureDate = departureDate;
        this.hotelPackage = hotelPackage;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Guest getGuest() {
        return this.guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getDepartureDate() {
        return this.departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public HotelPackage getHotelPackage() {
        return this.hotelPackage;
    }

    public void setHotelPackage(HotelPackage hotelPackage) {
        this.hotelPackage = hotelPackage;
    }

    public List<Request> getRequests() {
        return this.requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

}
