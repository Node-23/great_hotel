package nodev.Model;

import java.util.Date;
import java.util.List;

public class Reservation {
    private int id;
    private int roomNumber;
    private Date entryDate;
    private Date departureDate;
    private HotelPackage hotelPackage;
    private List<Request> requests;

    public Reservation(int id, int roomNumber, Date entryDate, Date departureDate, HotelPackage hotelPackage) {
        this.id = id;
        this.roomNumber = roomNumber;
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

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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
    
    public void addRequests(Request request){
        this.requests.add(request);
    }

    public float getTotal() {
        float total = 0;
        for (Request request : requests) {
            total += request.getTotal();
        }
        total += hotelPackage.getPrice();
        return total;
    }
   
}
