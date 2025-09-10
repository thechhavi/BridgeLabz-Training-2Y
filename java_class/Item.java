package java_class;


class Item {
    // attributes
    int itemCode;
    String itemName;
    double price;

    // method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    // method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        // creating an item object
        Item item1 = new Item();
        item1.itemCode = 101;
        item1.itemName = "Laptop";
        item1.price = 55000.00;

        // display item details
        item1.displayItemDetails();

        // calculate and display total cost
        int quantity = 3;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}
