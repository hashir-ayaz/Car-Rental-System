public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        RenterManagement renterManagement = new RenterManagement();
        CarManagement carManagement = new CarManagement();
        Car car1 = new CompactCar(1, "Toyota", "Corolla", 2019, false, 100.0f, "ABC123", "Bluetooth, GPS");
        Car car2 = new CompactCar(2, "Honda", "Civic", 2020, false, 100.0f, "ABC123", "Bluetooth, GPS");
        Car car3 = new CompactCar(3, "Suzuki", "Cultus", 2011, true, 100.0f, "ABC123", "Bluetooth, GPS");
        Car car4 = new CompactCar(4, "Lexus", "Lx570", 2022, false, 100.0f, "ABC123", "Bluetooth, GPS");
        carManagement.addCar(car1);
        carManagement.addCar(car2);
        carManagement.addCar(car3);
        carManagement.addCar(car4);

        RegularRenter renter1 = new RegularRenter(1, "Hashir Ayaz", "hashir@hotmail.com", "1234567890",
                "1234, Main Street, Khi, Pakistan");
        RegularRenter renter2 = new RegularRenter(2, "peter parker", "spiderman@gmail.com", "1234567890",
                "Queens, New York");
        renterManagement.addRenter(renter2);
        renterManagement.addRenter(renter1);

        System.out.println("--------------------------------------------");
        System.out.println("Welcome to the Awesomest Car Rental Service!");
        System.out.println("--------------------------------------------");
        System.out.println("All cars are:");
        carManagement.printAllCars();

        // test adding renter

        renter1.printRenter();

        System.out.println("All available cars are:");
        carManagement.printAllAvailableCars();

    }
}