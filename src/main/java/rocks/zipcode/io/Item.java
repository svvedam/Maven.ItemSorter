package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    String name;
    Long Id;
    Double price;
    public Item() {
        name = "";
        Id = 0L;
        price = 0.01;
    }

    public Item(Long id, String name, Double price) {
        this.Id=id;
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id=id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price=price;
    }
}
