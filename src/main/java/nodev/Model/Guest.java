package nodev.Model;

import java.util.List;

public class Guest {
    private int id;
    private String name;
    private String CPF;
    private String adress;
    private String phone;
    private String email;
    private List<Reservation> reservations;

    public Guest(int id, String name, String CPF, String adress, String phone, String email) {
        this.id = id;
        this.name = name;
        this.CPF = CPF;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }

    public Guest(int id, String name, String CPF, String adress, String phone, String email, List<Reservation> reservations) {
        this.id = id;
        this.name = name;
        this.CPF = CPF;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.reservations = reservations;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Reservation> getReservations() {
        return this.reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
