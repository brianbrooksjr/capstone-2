import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private Order order = new Order();   // users build this order

    public void displayMenu() {

    }

    private void addPizza() {
        Pizza pizza = new Pizza();
        pizza.buildPizza(scanner);
        order.addPizza(pizza);
        System.out.println("Pizza added!");
    }

    private void addGarlicKnots() {
        System.out.print("How many orders of garlic knots? ");
        int qty = readInt();
        if (qty < 1) qty = 1;

        GarlicKnots gk = new GarlicKnots(qty);
        order.addGarlicKnots(gk);

        System.out.println("Garlic knots added!");
    }

    private void addDrink() {
        System.out.println("\n=== Add Drink ===");

        scanner.nextLine(); // clear leftover newline

        System.out.print("Enter drink flavor (anything you want): ");
        String flavor = scanner.nextLine();

        System.out.print("Enter size (small / medium / large): ");
        String size = scanner.next().toLowerCase();

        Drink drink = new Drink(flavor, size);
        order.addDrink(drink);

        System.out.println("Drink added: " + size + " " + flavor);
    }


    private void checkout() {
        System.out.println("\n=== Final Order ===");
        order.displayOrder();
        System.out.println("\nThank you for ordering! Receipt will be generated soon.");
    }

    // A safe input reader to avoid crashes
    private int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            scanner.next(); // discard bad input
        }
        return scanner.nextInt();
    }

    public void showHomeScreen() {
    }
}