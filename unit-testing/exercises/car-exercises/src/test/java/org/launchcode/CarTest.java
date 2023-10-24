//package org.launchcode;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CarTest {
//    Car test_car;
//
//    @BeforeEach
//    public void initCar() {
//        test_car = new Car("Toyota", "Prius", 10, 50);
//    }
//
//    //TODO: add emptyTest so we can configure our runtime environment
//    @Test
//    public void emptyTest() {
//        assertEquals(10, 10, .001);
//    }
//
//    //TODO: constructor sets gasTankLevel properly
//    @Test
//    public void testInitialGasTank() {
//        assertEquals( 10, test_car.getGasTankLevel(),.001);
//    }
//
//    //TODO: gasTankLevel is accurate after driving within tank range
//    //TODO: gasTankLevel is accurate after attempting to drive past tank range
//    //TODO: can't have more gas than tank size, expect an exception
//}

package org.launchcode;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //TODO: constructor sets gasTankLevel properly
    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    org.launchcode.Car test_car;
    org.launchcode.Car test_car2;

    @BeforeEach
    public void createCarObject() {
        test_car = new org.launchcode.Car("Toyota", "Prius", 10, 50);
        test_car2 = new org.launchcode.Car("Toyota", "Prius", 8, 40);
    }
    @Test
    public void testInitialGasTank() {
        // Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testInitialGasTankT() {
        // Assert that the initial gas tank value is greater than 0
        assertTrue(test_car.getGasTankLevel() > 0);
    }

    @Test
    public void testInitialGasTankF() {
        // Assert that the initial gas tank value is not equal to 0
        assertFalse(test_car.getGasTankLevel() == 0);
    }
    @Test
    public void testGasTankAfterDriving() {
        test_car2.drive(50);
        assertEquals(6.75, test_car2.getGasTankLevel(),.001);
    }
    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(501);
        assertEquals(test_car.getGasTankLevel(), 0, .001);
    }
    //    @Test()
//    public void testGasOverfillException() {
//        assertthrows(IllegalArgumentException.class, () -> );
//    }
    @Test
    public void testAddGasExceedingTankCapacity() {
        // Attempt to add 5 gallons of gas to a car with an 8-gallon tank (should throw an exception)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> test_car2.addGas(5));
        assertEquals("Car cannot have more gas in the tank than the size of the tank", exception.getMessage());
        // Verify that the gas tank level hasn't changed
        assertEquals(8, test_car2.getGasTankLevel(), 0.001);
    }












}