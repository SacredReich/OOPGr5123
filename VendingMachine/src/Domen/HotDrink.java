package Domen;

public class HotDrink extends Product {
    private int drinkTemper;

    public HotDrink(String name, int price, int drinkTemper) {
        super(name, price);
        this.drinkTemper = drinkTemper;
    }

    public int getDrinkTemper() {
        return drinkTemper;
    }

    public void setDrinkTemper(int drinkTemper) {
        this.drinkTemper = drinkTemper;
    }

    @Override
    public String toString() {
        return super.toString() + " temperature: " + this.drinkTemper;
    }
}