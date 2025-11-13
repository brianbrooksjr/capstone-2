import java.util.Scanner;

public class UserInterface {
    public Scanner scanner;
    private Object drinkChoice;

    public void displayMenu() {
        int choice;
        while (true){
            System.out.println("Welcome To B's Italian Pizza :} ");
            System.out.println("1) Add Pizza");
            System.out.println("2) Add Garlic Knots");
            System.out.println("3) Add Drink");
            System.out.println("4) View Order");
            System.out.println("5) Checkout");
            System.out.println("0) Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Sorry we do not have that Drink");
                    continue; // Restart the loop

            }
        }
    }

            public void showHomeScreen () {
                Order order = new Order();

                Drink davesDrink = new Drink("Coke Zero", "large");
                order.addDrink(davesDrink);
            }


            private void addDrinksToOrder () {
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
                    switch (drinkChoice) {
                        case 1:
                            flavor = "Coke";
                            break;
                        case 2:
                            flavor = "Sprite";
                            break;
                        case 3:
                            flavor = "Fanta";
                            break;
                        case 4:
                            flavor = "Pepsi";
                            break;
                        case 5:
                            flavor = "Coke Zero";
                            break;
                        default:
                            System.out.println("Sorry we do not have that Drink");
                            continue; // Restart the loop
                    }
                }
            }
        }
