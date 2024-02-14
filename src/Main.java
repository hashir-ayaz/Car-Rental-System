
//hashir ayaz 22i2407 SEF
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) throws Exception {
                Scanner scanner = new Scanner(System.in);
                System.out.println("--------------------------------------------");
                System.out.println("Welcome to the Awesomest Car Rental Management System (CRMS) by Hashir Ayaz!");
                System.out.println("--------------------------------------------");

                // list of rent transactions
                List<RentTransaction> rentTransactions = new ArrayList<>();
                RenterManagement renterManagement = new RenterManagement();
                CarManagement carManagement = new CarManagement();

                {
                        // adding cars
                        carManagement.addCar(new SUV("1", "Toyota", "Fortuner", 2021, false, 1000, "ABC-123"));
                }
                {
                        // adding renters
                        renterManagement.addRenter(
                                        new RegularRenter(1, "Hashir Ayaz", "hashir@hotmail.com", "1234567890",
                                                        "1234, Main Street, Khi, Pakistan"));
                        renterManagement.addRenter(
                                        new FrequentRenter(2, "peter parker", "spiderman@gmail.com", "1234567890",
                                                        "Queens, New York", 0.30));
                        renterManagement.addRenter(
                                        new CorporateRenter(3, "Elon Musk", "elonmusk@yahoo.com", "1234567890",
                                                        "Space, AMERIKA"));

                        // renterManagement.printAllRenters();
                }

                System.out.println("Enter your details to rent a car: ");
                System.out.println("Enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Enter your email: ");
                String email = scanner.nextLine();
                System.out.println("Enter ur phone number: ");
                String phone = scanner.nextLine();
                System.out.println("Enter ur address: ");
                String address = scanner.nextLine();
                System.out.println("Enter your renter type:(regular/frequent/corporate) ");
                String renterType = scanner.nextLine();
                Renter tempRenter = null;
                if (renterType.equals("regular")) {
                        tempRenter = new RegularRenter(420, name, email, phone, address);
                } else if (renterType.equals("frequent")) {
                        tempRenter = new FrequentRenter(420, name, email, phone, address, 0.30);
                } else if (renterType.equals("corporate")) {
                        tempRenter = new CorporateRenter(420, name, email, phone, address);
                } else {
                        System.out.println("Invalid renter type");
                }

                // Renter tempRenter = new FrequentRenter(420, "yummyboy", "yummyboy@gmail.com",
                // "+92 333 6789876",
                // "everywhere , street 3", 30);
                // renterManagement.addRenter(tempRenter);

                System.out.println("All available cars are:");
                carManagement.printAllAvailableCars();

                System.out.println("Enter the car ID you want to rent: ");
                String carID = scanner.nextLine();
                tempRenter.rentCar(carManagement.getCar(carID));
                System.out.println("how many days do you want to rent the car for?");
                int daysRented = scanner.nextInt();
                carManagement.getCar(carID).setRentalStatus(true);

                rentTransactions.add(
                                new RentTransaction(tempRenter, carManagement.getCar(carID), daysRented, true, 500));

                // loop to print the rent transactions
                for (RentTransaction rentTransaction : rentTransactions) {
                        rentTransaction.printTransaction();
                }

                scanner.close();
        }

}