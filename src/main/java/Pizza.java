import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizza {


    private String size;
    private String crust;
    private boolean stuffedCrust;
    private final List<String> regularToppings;
    private final List<String> meatToppings;
    private final List<String> cheeseToppings;


    public Pizza() {
        this.size = size.toLowerCase();
        this.crust = crust.toLowerCase();
        this.stuffedCrust = stuffedCrust;
        this.regularToppings = new ArrayList<>();
        this.meatToppings = new ArrayList<>();
        this.cheeseToppings = new ArrayList<>();
    }




    public void addRegularTopping(String topping) {
        regularToppings.add(topping.toLowerCase());
    }

    public void addMeatTopping(String topping) {
        meatToppings.add(topping.toLowerCase());
    }

    public void addCheeseTopping(String topping) {
        cheeseToppings.add(topping.toLowerCase());
    }


    public double calculateBasePrice() {
        switch (size) {
            case "personal":
                return 8.50;
            case "medium":
                return 12.00;
            case "large":
                return 16.50;
            default:
                throw new IllegalArgumentException("Invalid size: " + size);
        }
    }

    private double calculateMeatCost() {
        switch (size) {
            case "personal":
                return meatToppings.size() * 1.00;
            case "medium":
                return meatToppings.size() * 2.00;
            case "large":
                return meatToppings.size() * 3.00;
            default:
                return 0;
        }
    }

    private double calculateCheeseCost() {
        switch (size) {
            case "personal":
                return cheeseToppings.size() * 0.75;
            case "medium":
                return cheeseToppings.size() * 1.50;
            case "large":
                return cheeseToppings.size() * 2.25;
            default:
                return 0;
        }
    }

    private double calculateStuffedCrustCost() {
        return stuffedCrust ? 2.00 : 0.00;
    }

    public String getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public boolean hasStuffedCrust() {
        return stuffedCrust;
    }

    public List<String> getRegularToppings() {
        return regularToppings;
    }

    public List<String> getMeatToppings() {
        return meatToppings;
    }

    public List<String> getCheeseToppings() {
        return cheeseToppings;
    }

    public double calculateTotalCost() {
        return calculateBasePrice()
                + calculateMeatCost()
                + calculateCheeseCost()
                + calculateStuffedCrustCost();
    }

    public void buildPizza(Scanner scanner) {
    }
}