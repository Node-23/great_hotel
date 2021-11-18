package nodev.Services;

import java.util.List;

import nodev.Interfaces.Management;
import nodev.Model.Guest;
import nodev.Model.Hotel;
import nodev.Model.HotelPackage;
import nodev.Model.Product;
import nodev.Model.Request;
import nodev.Model.Reservation;

public class HotelManagement implements Management{
    private Hotel greatHotel = new Hotel();

    @Override
    public boolean cancelReservation(int reservationId) {
        for(Reservation reservation : greatHotel.getReservations()) {
            if (reservation.getId() == reservationId) {
                greatHotel.getReservations().remove(reservation);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cancelReservation(String guestCPF) {
        Guest guest = findGuest(guestCPF);
        for(Reservation reservation : greatHotel.getReservations()) {
            if(reservation.getGuest().equals(guest)){
                greatHotel.getReservations().remove(reservation);
                return true;
            }
        }
        return false;
    }

    @Override
    public Guest findGuest(String guestCPF) {
        for(Guest guest : greatHotel.getGuests()) {
            if(guest.getCPF().equals(guestCPF)){
                return guest;
            }
        }
        return null;
    }

    @Override
    public Reservation findReservation(int roomNumber) {
        for(Reservation reservation : greatHotel.getReservations()) {
            if(reservation.getRoom().getNumber() == roomNumber){
                return reservation;
            }
        }
        return null;
    }

    @Override
    public Reservation findReservation(String guestCPF) {
        for(Reservation reservation : greatHotel.getReservations()) {
            if(reservation.getGuest().getCPF().equals(guestCPF)){
                return reservation;
            }
        }
        return null;
    }

    @Override
    public List<Guest> listGuests() {
        return greatHotel.getGuests();
    }

    @Override
    public List<Reservation> listReservations() {
        return greatHotel.getReservations();
    }

    @Override
    public boolean cancelRequest(int reservationId, int requestId) {
        Reservation reservation = findReservation(reservationId);
        for(Request request : reservation.getRequests()){
            if(request.getId() == requestId){
                reservation.getRequests().remove(request);
                return true;
            }
        }
        return false;
    }

    @Override
    public String closeReservation(int roomNumber) {
        Reservation reservation = findReservation(roomNumber);
        reservation.setClosed(true);
        return reservation.getClosedInfo();
    }

    @Override
    public void registerGuest(Guest newGuest) {
        greatHotel.getGuests().add(newGuest);
    }

    @Override
    public void createReservation(Reservation newReservation) {
        greatHotel.getReservations().add(newReservation);
    }

    @Override
    public void registerRequest(int roomNumber, Request newRequest) {
        findReservation(roomNumber).getRequests().add(newRequest);
    }
    
    @Override
    public void registerRequest(String guestCPF, Request newRequest){
        findReservation(guestCPF).getRequests().add(newRequest);
    }

    @Override
    public void registerProduct(Product newProduct) {
        greatHotel.getProducts().add(newProduct);
    }

    @Override
    public void createPackage(HotelPackage newPackage) {
        greatHotel.getPackages().add(newPackage);
    }
    
}
