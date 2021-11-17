package nodev.Model;

import java.util.Date;
import java.util.List;

public class Request {
    private int id;
    private List<Item> itens;
    private Date date;
    private float total;

    public Request(int id, List<Item> itens, Date date, float total) {
        this.id = id;
        this.itens = itens;
        this.date = date;
        this.total = total;
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

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotal() {
        return this.total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
