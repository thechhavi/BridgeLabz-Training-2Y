package java_class;

import java.util.ArrayList;

class CartItem {

    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    public void addItem(String name, double price, int qty) {
        cart.add(new CartItem(name, price, qty));
        System.out.println(qty + " x " + name + " added to cart.");
    }

    public void removeItem(String name) {
        boolean removed = false;
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(name)) {
                cart.remove(i);
                System.out.println(name + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(name + " not found in cart.");
        }
    }

    public void displayTotalCost() {
        double total = 0;
        System.out.println("\n--- Cart Details ---");
        for (CartItem item : cart) {
            System.out.println(item.itemName + " | Price: " + item.price + " | Qty: " + item.quantity + " | Subtotal: " + item.getItemTotal());
            total += item.getItemTotal();
        }
        System.out.println("Total Cart Value: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();

        myCart.addItem("Laptop", 55000, 1);
        myCart.addItem("Headphones", 2000, 2);
        myCart.addItem("Mouse", 800, 1);

        myCart.displayTotalCost();

        myCart.removeItem("Headphones");

        myCart.displayTotalCost();
    }
}
