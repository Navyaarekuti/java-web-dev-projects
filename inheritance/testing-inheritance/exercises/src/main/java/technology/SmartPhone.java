package technology;
public class SmartPhone extends Computer {
    private String operatingSystem;

    public SmartPhone(String brand, double price, String operatingSystem) {
        super(brand, price);
        this.operatingSystem = operatingSystem;
    }

    public String makeCall(String contact) {
        return "Calling " + contact + " using " + getBrand() + " smartphone.";
    }
    @Override
    public String toString() {
        return super.toString()+"{" +
                "OperatingSystem=" + operatingSystem +
                '}';
    }
}