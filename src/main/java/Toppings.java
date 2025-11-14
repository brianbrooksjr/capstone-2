import java.util.Arrays;
import java.util.List;

public class Toppings {

    private static final List<String> meatToppings = Arrays.asList(
            "Pepperoni","Sausage","Ham","Bacon","Chicken","Meatball"
    );
    private static final List<Double> meatBasePrices = Arrays.asList(
            1.0,1.0,1.0,1.0,1.0,1.0
    );
    private static final List<Double> meatExtraPrices = Arrays.asList(
            0.5,0.5,0.5,0.5,0.5,0.5
    );

    private static final List<String> cheeseToppings = Arrays.asList(
            "Mozzarella","Parmesan","Ricotta","Goat Cheese","Buffalo"
    );
    private static final List<Double> cheeseBasePrices = Arrays.asList(
            0.75,0.75,0.75,0.75,0.75
    );
    private static final List<Double> cheeseExtraPrices = Arrays.asList(
            0.3,0.3,0.3,0.3,0.3
    );

    private static final List<String> regularToppings = Arrays.asList(
            "Onions","Mushrooms","Bell Peppers","Olives","Tomatoes","Spinach","Basil","Pineapple","Anchovies"
    );

    private static final List<String> sauces = Arrays.asList(
            "Marinara","Alfredo","Pesto","BBQ","Buffalo","Olive Oil"
    );

    public static List<String> getMeatToppings() { return meatToppings; }
    public static List<Double> getMeatBasePrices() { return meatBasePrices; }
    public static List<Double> getMeatExtraPrices() { return meatExtraPrices; }

    public static List<String> getCheeseToppings() { return cheeseToppings; }
    public static List<Double> getCheeseBasePrices() { return cheeseBasePrices; }
    public static List<Double> getCheeseExtraPrices() { return cheeseExtraPrices; }

    public static List<String> getRegularToppings() { return regularToppings; }
    public static List<String> getSauces() { return sauces; }
}
