public class Drink {

    private final String flavor;
    private final String size;
    private final double cost;

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
        this.cost = calculateCost();
    }

    public double calculateCost() {
        return switch (this.size.toLowerCase()) {
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> throw new IllegalArgumentException("Invalid size: " + this.size);
        };
    }

        public double getCost() {
            return calculateCost();
        }

                @Override
                public String toString() {
                return size + " " + flavor + " - $" + cost;
            }
        }
