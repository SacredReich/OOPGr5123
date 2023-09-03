package Domen;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        if (price < 0)
            this.price = 10;
        else
            this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: price: " + this.price + "; name: " + this.name;
    }
}