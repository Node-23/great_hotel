package nodev.Model;

import java.util.Date;
import java.util.List;

public class Request {
    private int id;
    private List<Item> itens;
    private Date date;

    public Request(int id, List<Item> itens, Date date) {
        this.id = id;
        this.itens = itens;
        this.date = date;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Item> getItens() {
        return this.itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void addItens(Item item){
        this.itens.add(item);
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotal() {
        float total = 0;
        for (Item item : itens) {
            total += item.getQuantity() * item.getProduct().getPrice();
        }
        return total;
    }
}
