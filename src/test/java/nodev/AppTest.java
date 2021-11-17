package nodev;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nodev.Model.Guest;

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
}
