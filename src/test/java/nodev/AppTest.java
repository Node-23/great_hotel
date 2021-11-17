package nodev;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import nodev.Model.Guest;
import nodev.Model.HotelPackage;
import nodev.Model.Item;
import nodev.Model.Product;
import nodev.Model.Request;
import nodev.Model.Reservation;

public class AppTest 
{
    
    @Test
    public void createGuest()
    {   
        Guest guest = new Guest(
            1,
            "Jorge Almeida", 
            "021.124.574-31", 
            "Rua das Flores, 143, Bairro dos Jardins, Teresina", 
            "99431-1232", 
            "jorgeal@gmail.com"
        );

        assertEquals("Compare ID", 1, guest.getId());
        assertEquals("Compare name", "Jorge Almeida", guest.getName());
        assertEquals("Compare CPF", "021.124.574-31", guest.getCPF());
        assertEquals("Compare adress", "Rua das Flores, 143, Bairro dos Jardins, Teresina", guest.getAdress());
        assertEquals("Compare phone", "99431-1232", guest.getPhone());
        assertEquals("Compare email", "jorgeal@gmail.com", guest.getEmail());
    }

    @Test
    public void CreateProduct(){
        Product product = new Product(
            1,
            "Chocolate",
            5.99,
            30
        );

        assertEquals("Compare ID", 1, product.getId());
        assertEquals("Compare name", "Chocolate", product.getName());
        assertEquals("Compare price", 5.99, product.getPrice(), 0.1);
        assertEquals("Compare in stock", 30, product.getInStock());

    }

    @Test
    public void CreateItem(){
        Product product = new Product(
            1,
            "Chocolate",
            5.99,
            30
        );

        Item item = new Item(
            product,
            2
        );

        assertTrue("Compare product", product.equals(item.getProduct()));
        assertEquals("Compare quantity", 2, item.getQuantity());
    }

    @Test
    public void CreateRequest(){
        Product product = new Product(
            1,
            "Chocolate",
            5.99,
            30
        );

        Item item = new Item(
            product,
            2
        );

        List<Item> itens = new ArrayList<Item>();
        itens.add(item);
        Date date = new Date();
        Request request = new Request(
            1,
            itens,
            date
        );

        assertEquals("Compare id", 1, request.getId());
        assertThat("Compare itens", request.getItens(), is(itens));
        //assertThat("Compare date", request.getDate(), is(new Date()));
    }

    @Test
    public void CreateHotelPackage(){
        HotelPackage hotelPackage = new HotelPackage(
            1,
            "Basic package",
            "2-day stay including breakfast, lunch and dinner",
            259.99
        );

        assertEquals("Compare ID", 1, hotelPackage.getId());
        assertEquals("Compare name", "Basic package", hotelPackage.getName());
        assertEquals("Compare description", "2-day stay including breakfast, lunch and dinner", hotelPackage.getDescription());
        assertEquals("Compare price", 259.99, hotelPackage.getPrice(), 0.1);
    }

    @Test
    public void CreateReservation(){
        HotelPackage hotelPackage = new HotelPackage(
            1,
            "Basic package",
            "2-day stay including breakfast, lunch and dinner",
            259.99
        );
        
        Date entryDate = new Date();
        Date departureDate = new Date(new Date().getTime() + (2 * 86400000));
        Reservation reservation = new Reservation(
            1,
            105,
            entryDate,
            departureDate,
            hotelPackage
        );

        assertEquals("Compare id", 1, reservation.getId());
        assertEquals("Compare room", 105, reservation.getRoomNumber());
        //assertEquals("Compare entryDate", entryDate, reservation.getEntryDate());
        //assertEquals("Compare departureDate", departureDate, reservation.getDepartureDate());
        assertThat("Compare package", reservation.getHotelPackage(), is(hotelPackage));
    }

    //TODO Make all other models tests
}
