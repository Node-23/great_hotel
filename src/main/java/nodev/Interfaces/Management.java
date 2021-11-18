package nodev.Interfaces;

import java.util.List;

import nodev.Model.Guest;
import nodev.Model.Reservation;

public interface Management {
    public void cancelReservation(int reservationId);
    public void cancelReservation(String guestCPF);
    public Guest findGuest(String guestCPF);
    public Reservation findReservation(int roomNumber);
    public Reservation findReservation(String guestCPF);
    public List<Guest> listGuests();
    public List<Reservation> listReservations();
    public void cancelRequest(int requestId);
    public String closeReservation(int roomNumber);
}
