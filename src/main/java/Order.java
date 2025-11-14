import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Pizza> pizzas = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<GarlicKnots> garlicKnots = new ArrayList<>();

    public void addPizza(Pizza p) {
        pizzas.add(p);
    }

    public void addDrink(Drink d) {
        drinks.add(d);
    }

    public void addGarlicKnots(GarlicKnots gk) {
        garlicKnots.add(gk);
    }

    public boolean isEmpty() {
        return pizzas.isEmpty() && drinks.isEmpty() && garlicKnots.isEmpty();
    }

    public double calculateTotal() {
        double total = 0;

        for (Pizza p : pizzas) total += p.calculateTotalCost();
        for (Drink d : drinks) total += d.getCost();
        for (GarlicKnots gk : garlicKnots) total += gk.getCost();

        return total;
    }

    public void displayOrder() {
        System.out.println("\n====== ORDER SUMMARY ======");

        if (pizzas.isEmpty() && drinks.isEmpty() && garlicKnots.isEmpty()) {
            System.out.println("Your order is empty.");
            return;
        }

        if (!pizzas.isEmpty()) {
            System.out.println("\n-- PIZZAS --");
            for (Pizza p : pizzas) {
                p.display();
            }
        }

        if (!drinks.isEmpty()) {
            System.out.println("\n-- DRINKS --");
            for (Drink d : drinks) {
                System.out.println(d);
            }
        }

        if (!garlicKnots.isEmpty()) {
            System.out.println("\n-- GARLIC KNOTS --");
            for (GarlicKnots gk : garlicKnots) {
                System.out.println(gk);
            }
        }

        System.out.println("\nTOTAL: $" + String.format("%.2f", calculateTotal()));
        System.out.println("============================");
    }
}
