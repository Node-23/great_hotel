package nodev.Model;

import java.util.List;

public class Hotel {
    private List<Product> products;
    private List<Room> rooms;
    private List<HotelPackage> packages;
    private List<Guest> guests;
    private List<Reservation> reservations;

    public Hotel() {
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Room> getRooms() {
        return this.rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<HotelPackage> getPackages() {
        return this.packages;
    }

    public void setPackages(List<HotelPackage> packages) {
        this.packages = packages;
    }

    public List<Guest> getGuests() {
        return this.guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public List<Reservation> getReservations() {
        return this.reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

}
