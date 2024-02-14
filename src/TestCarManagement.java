import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class TestCarManagement {

    private CarManagement carManagement;
    private Car car1;
    private Car car2;

    @Before
    public void setUp() {
        carManagement = new CarManagement();
        car1 = new Car("123", "Brand1", "Model1", 2022, false, 100.0, "ABC123");
        car2 = new Car("456", "Brand2", "Model2", 2023, true, 150.0, "DEF456");
    }

    @Test
    public void testAddCar() {
        carManagement.addCar(car1);
        carManagement.addCar(car2);

        ArrayList<Car> expectedAllCars = new ArrayList<>();
        expectedAllCars.add(car1);
        expectedAllCars.add(car2);

        ArrayList<Car> actualAllCars = carManagement.getAllCars();
        Assert.assertEquals(expectedAllCars, actualAllCars);
    }

    @Test
    public void testRemoveCar() {
        carManagement.addCar(car1);
        carManagement.addCar(car2);

        carManagement.removeCar("123");

        ArrayList<Car> expectedAllCars = new ArrayList<>();
        expectedAllCars.add(car2);

        ArrayList<Car> actualAllCars = carManagement.getAllCars();
        Assert.assertEquals(expectedAllCars, actualAllCars);
    }

    @Test
    public void testPrintAllCars() {
        // Capture the output to verify
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        carManagement.addCar(car1);
        carManagement.addCar(car2);
        carManagement.printAllCars();

        // Restore the original System.out
        System.setOut(System.out);

        String expectedOutput = "Car Details:\n" +
                "\tCar ID: 123\n" +
                "\tBrand: Brand1\n" +
                "\tModel: Model1\n" +
                "\tYear: 2022\n" +
                "\tRental Status: false\n" +
                "\tRental Fee: 100.0\n" +
                "\tLicense Plate: ABC123\n" +
                "\n" +
                "Car Details:\n" +
                "\tCar ID: 456\n" +
                "\tBrand: Brand2\n" +
                "\tModel: Model2\n" +
                "\tYear: 2023\n" +
                "\tRental Status: true\n" +
                "\tRental Fee: 150.0\n" +
                "\tLicense Plate: DEF456\n" +
                "\n";
        String actualOutput = outputStream.toString();
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSetRentStatus() {
        carManagement.addCar(car1);
        carManagement.addCar(car2);

        carManagement.setRentStatus("123", true);

        boolean expectedRentStatus1 = true;
        boolean actualRentStatus1 = car1.isRentalStatus();
        Assert.assertEquals(expectedRentStatus1, actualRentStatus1);

        boolean expectedRentStatus2 = false;
        boolean actualRentStatus2 = car2.isRentalStatus();
        Assert.assertEquals(expectedRentStatus2, actualRentStatus2);
    }

    @Test
    public void testGetCar() {
        carManagement.addCar(car1);
        carManagement.addCar(car2);

        Car expectedCar1 = car1;
        Car actualCar1 = carManagement.getCar("123");
        Assert.assertEquals(expectedCar1, actualCar1);

        Car expectedCar2 = null;
        Car actualCar2 = carManagement.getCar("789");
        Assert.assertEquals(expectedCar2, actualCar2);
    }

    @Test
    public void testPrintAllAvailableCars() {
        // Capture the output to verify
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        carManagement.addCar(car1);
        carManagement.addCar(car2);
        carManagement.printAllAvailableCars();

        // Restore the original System.out
        System.setOut(System.out);

        String expectedOutput = "Car Details:\n" +
                "\tCar ID: 123\n" +
                "\tBrand: Brand1\n" +
                "\tModel: Model1\n" +
                "\tYear: 2022\n" +
                "\tRental Status: false\n" +
                "\tRental Fee: 100.0\n" +
                "\tLicense Plate: ABC123\n" +
                "\n";
        String actualOutput = outputStream.toString();
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}