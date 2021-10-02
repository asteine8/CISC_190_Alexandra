abstract class Food {
    protected String name;
    protected double price;
    protected int quantity;
    private double totalPrice;

    public Food(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        totalPrice = price * quantity;
    }

    public double recalculateTotal(double newPrice, int newQuantity) {
        this.price = newPrice;
        this.quantity = newQuantity;
        return recalculateTotal();
    }

    public double recalculateTotal() {
        totalPrice = price * quantity;
        return totalPrice;
    }

    
}
