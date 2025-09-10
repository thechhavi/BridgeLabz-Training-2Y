package java_class;


class MobilePhone {
    // attributes
    String brand;
    String model;
    double price;

    // method to display phone details
    public void displayPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // creating first mobile object
        MobilePhone phone1 = new MobilePhone();
        phone1.brand = "Apple";
        phone1.model = "iPhone 15 Pro";
        phone1.price = 149999.00;

        // creating second mobile object
        MobilePhone phone2 = new MobilePhone();
        phone2.brand = "Samsung";
        phone2.model = "Galaxy S24 Ultra";
        phone2.price = 129999.00;

        // displaying details
        System.out.println("Mobile 1 Details:");
        phone1.displayPhoneDetails();

        System.out.println("\nMobile 2 Details:");
        phone2.displayPhoneDetails();
    }
}
