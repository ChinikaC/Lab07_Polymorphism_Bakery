import interfaces.IDrink;

import java.time.LocalDate;

public abstract class Drink {

    private String name;
    private int price;

    public Drink(String name, int price){
        this.name = name;
        this.price = price;
    }

    // Getters & Setters

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

    // Methods


}