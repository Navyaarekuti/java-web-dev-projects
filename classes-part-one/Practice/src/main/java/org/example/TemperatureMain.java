package org.example;

public class TemperatureMain {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        //temp.setFahrenheit(-200.0);
        temp.setAbsolutefahrenheit1(20.0);
        //System.out.println("The temp is " +temp.getFahrenheit());
        System.out.println("the temp is" + temp.getAbsolutefahrenheit1());
//        TemperatureWithStaticFieldInClass temp = new TemperatureWithStaticFieldInClass();
//        temp.setFahrenheit(-500.0);
//        temp.setFahrenheit(500.0);
//        System.out.println("Accessing static field from outside the class:");
//        System.out.println("Absolute zero in F is: " + TemperatureWithStaticFieldInClass.absolutefahrenheit1);
//        System.out.println("Absolute zero in F is: " + temp.getFahrenheit1());


    }
}