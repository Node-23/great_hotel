package nodev.Interfaces;

import java.util.List;

import nodev.Model.Guest;
import nodev.Model.HotelPackage;
import nodev.Model.Product;
import nodev.Model.Request;
import nodev.Model.Reservation;

public interface Management {
    public void registerGuest(Guest newGuest);
    public void createReservation(Reservation newReservation);
    public void registerRequest(int roomNumber, Request newRequest);
    public void registerRequest(String guestCPF, Request newRequest);
    public void registerProduct(Product newProduct);
    public void createPackage(HotelPackage newPackage);
    public boolean cancelReservation(int reservationId);
    public boolean cancelReservation(String guestCPF);
    public Guest findGuest(String guestCPF);
    public Reservation findReservation(int roomNumber);
    public Reservation findReservation(String guestCPF);
    public List<Guest> listGuests();
    public List<Reservation> listReservations();
    public boolean cancelRequest(int reservationId, int requestId);
    public String closeReservation(int roomNumber);
}
