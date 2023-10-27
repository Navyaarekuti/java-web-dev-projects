package technology;

public class Computer extends AbstractEntity {
    private String brand;
    private double price;
    public Computer() {
        super(); // Call the constructor of the parent class if necessary
    }

    public Computer(String brand, double price) {
        super();
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    //TODO:setters are used when we want to set the data using default constructor and we must declare the default constructor
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String powerOn() {
        return brand + " is powering on";
    }
    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return "PRODUCT INFORMATION:" + newline +
                "ID: " + id + newline +
                "Item: " + brand + newline +

                "Price: " + price + newline;

    }
}