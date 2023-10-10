package org.example;

public class TemperatureWithStaticFieldInClass {
    private double fahrenheit1;
    public static double absolutefahrenheit1= -459.67;

    public double getFahrenheit1() {
        return fahrenheit1;
    }

    public void setFahrenheit(double fahrenheit1) {
        if(fahrenheit1<absolutefahrenheit1) {
            System.out.println("error");
        }
        else{
            this.fahrenheit1 = fahrenheit1;
        }

    }
    public TemperatureWithStaticFieldInClass() {
        // You can set the static field in the constructor
        absolutefahrenheit1 = -459.67;
    }
    public static void printAbsoluteZeroFahrenheit() {
        System.out.println("Absolute zero in F is: " + absolutefahrenheit1);
    }
}
