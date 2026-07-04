abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    abstract double calculateTotalPrice();

    public void displayItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

class VegItem extends FoodItem {
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    private double serviceCharge;

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + serviceCharge;
    }
}

public class Main {
    public static void main(String[] args) {

        VegItem veg = new VegItem();
        veg.setItemName("Paneer Curry");
        veg.setPrice(200);
        veg.setQuantity(2);

        NonVegItem nonVeg = new NonVegItem();
        nonVeg.setItemName("Chicken Biryani");
        nonVeg.setPrice(300);
        nonVeg.setQuantity(2);
        nonVeg.setServiceCharge(50);

        veg.displayItemDetails();
        System.out.println("Total Price: " + veg.calculateTotalPrice());

        System.out.println();

        nonVeg.displayItemDetails();
        System.out.println("Total Price: " + nonVeg.calculateTotalPrice());
    }
}
