import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizza {


    private  String size;
    private  String crust;
    private  boolean stuffedCrust;

    private  List<String> regularToppings;
    private  List<String> meatToppings;
    private  List<String> cheeseToppings;


    public Pizza() {
        this.regularToppings = new ArrayList<>();
        this.meatToppings = new ArrayList<>();
        this.cheeseToppings = new ArrayList<>();
    }

    public void buildPizza(Scanner scanner) {
        System.out.println("=== Create Your Pizza ===");

        while (true) {
            System.out.print("Choose size (personal/medium/large): ");
            size = scanner.nextLine().toLowerCase();
            if (size.equals("personal") || size.equals("medium") || size.equals("large")) break;
            System.out.println("Invalid size.");
        }

        while (true) {
            System.out.print("Choose crust (thin/regular/thick/cauliflower): ");
            crust = scanner.nextLine().toLowerCase();
            if (crust.equals("thin") || crust.equals("regular") || crust.equals("thick")
                    || crust.equals("cauliflower")) break;
            System.out.println("Invalid crust.");
        }

        System.out.print("Stuffed crust? (y/n): ");
        stuffedCrust = scanner.nextLine().equalsIgnoreCase("y");

        addMultipleToppings(scanner, "Select Meat Toopings: \"Pepperoni\",\"Sausage\",\"Ham\",\"Bacon\",\"Chicken\",\"Meatball\"", meatToppings);

        addMultipleToppings(scanner, "Select Cheese Toopings:\"Mozzarella\",\"Parmesan\",\"Ricotta\",\"Goat Cheese\",\"Buffalo\"", cheeseToppings);

        addMultipleToppings(scanner, "Select Regular Toopings:\"Onions\",\"Mushrooms\",\"Bell Peppers\",\"Olives\",\"Tomatoes\",\"Spinach\",\"Basil\",\"Pineapple\",\"Anchovies\"", regularToppings);
        System.out.println("Pizza completed!");
    }

    private void addMultipleToppings(Scanner scanner, String type, List<String> list) {
        System.out.println("Add " + type + " toppings (comma-separated or 0 to skip): ");
        String input = scanner.nextLine();

        if (input.equals("0")) return;

        String[] toppings = input.split(",");

        for (String t : toppings) {
            t = t.trim();

            if (!t.isEmpty())
                list.add(t.toLowerCase());
        }
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


    public double calculateTotalCost() {
        return calculateBasePrice()
                + calculateMeatCost()
                + calculateCheeseCost()
                + calculateStuffedCrustCost();
    }

    public void display() {
        System.out.println("\nPizza Summary:");
        System.out.println("Size: " + size);
        System.out.println("Crust: " + crust);
        System.out.println("Stuffed: " + (stuffedCrust ? "Yes" : "No"));
        System.out.println("Meats: " + meatToppings);
        System.out.println("Cheeses: " + cheeseToppings);
        System.out.println("Regular Toppings: " + regularToppings);
        System.out.println("Total Cost: $" + String.format("%.2f", calculateTotalCost()));
    }



}