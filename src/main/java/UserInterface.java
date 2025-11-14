import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private Order order = new Order();

    public void showHomeScreen() {

        while (true) {
            System.out.println("\n=== B's Italian Pizza ===");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            int choice = readInt();

            switch (choice) {
                case 1:
                    order = new Order();
                    displayMenu();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\n--- ORDER MENU ---");
            System.out.println("1) Add Pizza");
            System.out.println("2) Add Garlic Knots");
            System.out.println("3) Add Drink");
            System.out.println("4) View Order");
            System.out.println("5) Checkout");
            System.out.println("0) Cancel Order & Return Home");
            System.out.print("Choose: ");

            int choice = readInt();

            switch (choice) {
                case 1:
                    addPizza();
                    break;

                case 2:
                    addGarlicKnots();
                    break;

                case 3:
                    addDrink();
                    break;

                case 4:
                    order.displayOrder();
                    break;

                case 5:
                    checkout();
                    return;

                case 0:
                    System.out.println("Order canceled.");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void addPizza() {
        scanner.nextLine(); // flush newline
        Pizza pizza = new Pizza();
        pizza.buildPizza(scanner);
        order.addPizza(pizza);
        System.out.println("Pizza added!");
    }

    private void addGarlicKnots() {
        System.out.print("How many orders? ");
        int qty = readInt();
        if (qty < 1) qty = 1;

        GarlicKnots gk = new GarlicKnots(qty);
        order.addGarlicKnots(gk);
        System.out.println("Garlic Knots added!");
    }

    private void addDrink() {
        scanner.nextLine(); // flush newline

        System.out.print("Enter drink flavor: ");
        String flavor = scanner.nextLine();

        System.out.print("Enter size (small/medium/large): ");
        String size = scanner.next();

        Drink drink = new Drink(flavor, size);
        order.addDrink(drink);

        System.out.println("Drink added!");
    }

    private void checkout() {
        System.out.println("\n=== FINAL ORDER ===");
        order.displayOrder();
        System.out.println("Thank you!");
    }

    private int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
