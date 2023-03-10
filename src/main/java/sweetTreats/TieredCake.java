package sweetTreats;

import java.time.LocalDate;

public class TieredCake extends SweetTreat {

    private int numberOfTiers;
    private int numberOfLayers;

    public TieredCake(String name, int price, int numberOfTiers, int numberOfLayers) {
        super(name, price);
        this.numberOfTiers = numberOfTiers;
        this.numberOfLayers = numberOfLayers;
    }

    // Methods

    @Override
    public String addTopping() {
        return "Whipped Cream and Oreos";
    }

    public void addTiers(int numberOfTiersToAdd) { // label of what we are adding
        this.numberOfTiers += numberOfTiersToAdd;
    }


    public int getNumberOfTiers() {
        return numberOfTiers;
    }

    public void setNumberOfTiers(int numberOfTiers) {
        this.numberOfTiers = numberOfTiers;
    }

    public int getNumberOfLayers() {
        return numberOfLayers;
    }

    public void setNumberOfLayers(int numberOfLayers) {
        this.numberOfLayers = numberOfLayers;
    }

    public LocalDate useByDate(){
        return LocalDate.of(2023,2,10);
    }

    // Overloading
    public String cakeShape() {return "Every cake that we sell are circular shaped.";}
    public String cakeShape(String message){ return "Well actually, that was a lie because " + message + ".";}



}
