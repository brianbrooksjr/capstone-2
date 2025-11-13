public class Drink {

    private String flavor;
    private String size;
    private double cost;

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
        this.cost = calculateCost();
    }

    public double calculateCost() {
        return switch (this.size.toLowerCase()) {
            case "small" -> 2.00f;
            case "medium" -> 2.50f;
            case "large" -> 3.00f;
            default -> throw new IllegalArgumentException("Invalid size: " + this.size);
        };
    }
                @Override
                public String toString() {
                return size + " " + flavor + " - $" + cost;
            }
        }
