package technology;

public class Laptop extends Computer {
    public double screenSize;

    public Laptop(String brand, double price, double screenSize) {
        super(brand, price);
        this.screenSize = screenSize;
    }

    public String openLid() {
        return "Opening the laptop lid.";
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString()+"{" +
                "screenSize=" + screenSize +
                '}'+newline;
    }
}