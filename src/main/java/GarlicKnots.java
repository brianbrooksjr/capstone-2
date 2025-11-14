public class GarlicKnots {

    private final int quantity;
    private final double costPerKnot = 1.50;

    public GarlicKnots(int quantity) {
        if (quantity < 1) {
            throw new IllegalArgumentException("Quantity must be at least 1.");
        }
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return quantity * costPerKnot;
    }

    @Override
    public String toString() {
        return quantity + " order(s) of Garlic Knots - $" + String.format("%.2f", getCost());
    }
}