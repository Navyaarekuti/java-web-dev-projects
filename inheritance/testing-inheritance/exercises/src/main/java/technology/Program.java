package technology;

public class Program {
    public static void main(String[] args) {

        Computer pc = new Computer("Lenovo", 444.99);
        Computer pc2 = new Computer();
       pc2.setBrand("hp");
        pc2.setPrice(99.99);
        Laptop laptop = new Laptop("Dell", 234.6, 15.6);
        SmartPhone smartphone = new SmartPhone("Samsung", 499.99, "Android");
        System.out.println(pc);
        System.out.println(pc2);
        System.out.println(laptop);
        System.out.println(smartphone);

        System.out.println(pc.powerOn());
        System.out.println("Laptop Screen Size: " + laptop.openLid() + " " + laptop.screenSize + " inches");
        System.out.println(smartphone.makeCall("John"));

        // Accessing unique IDs
        System.out.println("Computer ID: " + pc.getId());
        System.out.println("Computer ID: " + pc2.getId());
        System.out.println("Computer Brand: " + pc2.getBrand());
        System.out.println("Laptop ID: " + laptop.getId());
        System.out.println("SmartPhone ID: " + smartphone.getId());
    }
}
