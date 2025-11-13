import java.util.Scanner;

public class UserInterface {
    public Scanner scanner;

    public void showHomeScreen() {
        Order order = new Order();
        // ask user if they want a drink and what size & flavor
        // 1. be able to add 1 drink based on user input
        // 2. be able to add >1

        Drink davesDrink = new Drink("Coke Zero", "large");
        order.addDrink(davesDrink);
    }

    private void addDrinksToOrder() {
        while (true) {
            //Drink Menu Display
            System.out.println("=== Drink Menu ===");
            System.out.println("1) Coke");
            System.out.println("2) Sprite");
            System.out.println("3) Fanta");
            System.out.println("4) Pepsi");
            System.out.println("5) Coke Zero");
            System.out.println("0) Exit Drink Selection");

            //Prompt for User Drink Selection
            System.out.print("Select a drink by number: ");
            int drinkChoice = scanner.nextInt();

            if (drinkChoice == 0) {
                break; // Exit the drink selection loop
            }

            String flavor;
            switch (drinks) {
                case 1:
                    flavor = "Coke";
                    break;
                default:
                    System.out.println("Sorry we do not have that Drink");
                    continue;
            }

        }
    }
}
