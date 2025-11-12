public class Drink {

    private String flavor;
    private String size;
    private float cost;

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
        this.cost = calculateCost();
    }

    private float calculateCost() {
        switch (this.size.toLowerCase()) {
            case "small":
                return 2.00f;
            case "medium":
                return 2.50f;
            case "large":
                return 3.00f;
            default:
                throw new IllegalArgumentException("Invaild size: " + this.size);


}
