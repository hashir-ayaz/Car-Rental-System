//hashir ayaz 22i2407 SEF

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) throws Exception {
                System.out.println("--------------------------------------------");
                System.out.println("Welcome to the Awesomest Car Rental Management System (CRMS) by Hashir Ayaz!");
                System.out.println("--------------------------------------------");

                // list of rent transactions
                List<RentTransaction> rentTransactions = new ArrayList<>();
                RenterManagement renterManagement = new RenterManagement();
                CarManagement carManagement = new CarManagement();

                // adding cars
                carManagement.addCar(new CompactCar(1, "Toyota", "Corolla", 2019, false, 1000.0f, "ABC-123",
                                "Basic features, suitable for short-distance travel."));
                carManagement.addCar(new LuxuryCar(2, "Audi", "A8", 2020, true, 5000.0f, "DEF-789",
                                "High-end, suitable for special occasions."));
                carManagement.addCar(new SUV(3, "Toyota", "Fortuner", 2017, false, 3000.0f, "GHI-101",
                                "Spacious, suitable for family trips."));

                // adding renters
                renterManagement.addRenter(new RegularRenter(1, "Hashir Ayaz", "hashir@hotmail.com", "1234567890",
                                "1234, Main Street, Khi, Pakistan"));
                renterManagement.addRenter(new FrequentRenter(2, "peter parker", "spiderman@gmail.com", "1234567890",
                                "Queens, New York", 0.30));
                renterManagement.addRenter(new CorporateRenter(3, "Elon Musk", "elonmusk@yahoo.com", "1234567890",
                                "Space, AMERIKA"));

                renterManagement.printAllRenters();

                System.out.println("All available cars are:");
                carManagement.printAllAvailableCars();

                Renter tempRenter = new FrequentRenter(420, "yummyboy", "yummyboy@gmail.com", "+92 333 6789876",
                                "everywhere , street 3", 30);
                renterManagement.addRenter(tempRenter);

                tempRenter.rentCar(carManagement.getCar(1));
                rentTransactions.add(new RentTransaction(tempRenter, carManagement.getCar(1), 3, true, 500));

                // loop to print the rent transactions
                for (RentTransaction rentTransaction : rentTransactions) {
                        rentTransaction.printTransaction();
                }

        }
}