package org.example;

public class Temperature {
    private double fahrenheit;
    public double absolutefahrenheit1;

    public double getAbsolutefahrenheit1() {
        return absolutefahrenheit1;
    }

    public void setAbsolutefahrenheit1(double absolutefahrenheit1) {
        double absolutefahrenheit = 30;
        if(absolutefahrenheit<absolutefahrenheit1) {
            System.out.println("error");
        }
        else{
            this.absolutefahrenheit1 = absolutefahrenheit1;

        }
    }
    //public static double absolute fahrenheit;

//    public double getFahrenheit() {
//        return fahrenheit;
//    }
//
//    public void setFahrenheit(double fahrenheit) {
//        double absolutefahrenheit = -300;
//        if(fahrenheit<absolutefahrenheit) {
//            System.out.println("error");
//        }
//        else{
//            this.fahrenheit = fahrenheit;
//        }
//    }
}
