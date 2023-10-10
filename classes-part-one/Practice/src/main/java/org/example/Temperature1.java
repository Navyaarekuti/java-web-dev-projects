package org.example;

public class Temperature1 {


        private double fahrenheit;

        public double getFahrenheit() {
            return fahrenheit;
        }

        public void setFahrenheit(double aFahrenheit) {

            double absoluteZeroFahrenheit = -459.67;

            if (aFahrenheit < absoluteZeroFahrenheit) {
                System.out.println("Value is below absolute zero");
            }

            fahrenheit = aFahrenheit;
        }
    }

