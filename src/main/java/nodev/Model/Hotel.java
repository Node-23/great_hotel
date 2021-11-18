package nodev.Model;

import java.util.List;

public class Hotel {
    private List<Product> products;
    private List<Room> rooms;
    private List<HotelPackage> packages;

    public Hotel(List<Product> products, List<Room> rooms, List<HotelPackage> packages) {
        this.products = products;
        this.rooms = rooms;
        this.packages = packages;
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
}
