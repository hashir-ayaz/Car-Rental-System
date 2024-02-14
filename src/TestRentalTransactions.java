import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRentalTransactions {

    private Renter renter;
    private Car car;
    private RentTransaction rentTransaction;

    @Before
    public void setUp() {
        renter = new RegularRenter(1, "John Doe", "hashir@hotmail.com", "1234567890",
                "1234, Main Street, Khi, Pakistan");
        car = new LuxuryCar("2", "Honda", "civic", 2023, false, 2000, "H-1881");
        rentTransaction = new RentTransaction(renter, car, 5, false, 100.0);
    }

    @Test
    public void testGetNumDaysRented() {
        int expectedNumDaysRented = 5;
        int actualNumDaysRented = rentTransaction.getNumDaysRented();
        Assert.assertEquals(expectedNumDaysRented, actualNumDaysRented);
    }

    @Test
    public void testGetTotalCost() {
        double expectedTotalCost = 0.0;
        double actualTotalCost = rentTransaction.getTotalCost();
        Assert.assertEquals(expectedTotalCost, actualTotalCost, 0.001);
    }

    @Test
    public void testGetDamageCost() {
        double expectedDamageCost = 0.0;
        double actualDamageCost = rentTransaction.getDamageCost();
        Assert.assertEquals(expectedDamageCost, actualDamageCost, 0.001);
    }

    @Test
    public void testGetDistanceTravelled() {
        double expectedDistanceTravelled = 100.0;
        double actualDistanceTravelled = rentTransaction.getDistanceTravelled();
        Assert.assertEquals(expectedDistanceTravelled, actualDistanceTravelled, 0.001);
    }

    @Test
    public void testIsHasDamage() {
        boolean expectedHasDamage = false;
        boolean actualHasDamage = rentTransaction.isHasDamage();
        Assert.assertEquals(expectedHasDamage, actualHasDamage);
    }

    @Test
    public void testGetRenter() {
        Renter expectedRenter = renter;
        Renter actualRenter = rentTransaction.getRenter();
        Assert.assertEquals(expectedRenter, actualRenter);
    }

    @Test
    public void testGetCar() {
        Car expectedCar = car;
        Car actualCar = rentTransaction.getCar();
        Assert.assertEquals(expectedCar, actualCar);
    }

    @Test
    public void testCalculateTotalCost_Insured() {
        double expectedTotalCost = car.getRentalFee() * rentTransaction.getNumDaysRented();
        double actualTotalCost = rentTransaction.calculateTotalCost(true);
        Assert.assertEquals(expectedTotalCost, actualTotalCost, 0.001);
    }

    @Test
    public void testCalculateTotalCost_Uninsured() {
        double expectedTotalCost = car.getRentalFee() * rentTransaction.getNumDaysRented() +
                car.getDamageCostUninsured();
        rentTransaction.setHasDamage(false);
        double actualTotalCost = rentTransaction.calculateTotalCost(false);
        Assert.assertEquals(expectedTotalCost, actualTotalCost, 0.001);
    }

}