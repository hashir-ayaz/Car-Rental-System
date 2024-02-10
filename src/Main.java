//hashir ayaz 22i2407 SEF
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------------------");
        System.out.println("Welcome to the Awesomest Car Rental Management System (CRMS) by Hashir Ayaz!");
        System.out.println("--------------------------------------------");

        RenterManagement renterManagement = new RenterManagement();
        CarManagement carManagement = new CarManagement();
        Car car1 = new CompactCar(1, "Toyota", "Corolla", 2019, false, 1000.0f, "ABC-123",
                "Basic features, suitable for short-distance travel.");
        Car car2 = new LuxuryCar(2, "Audi", "A8", 2020, true, 5000.0f, "DEF-789",
                "High-end, suitable for special occasions.");
        Car car3 = new SUV(3, "Toyota", "Fortuner", 2017, false, 3000.0f, "GHI-101",
                "Spacious, suitable for family trips.");

        carManagement.addCar(car1);
        carManagement.addCar(car2);
        carManagement.addCar(car3);

        RegularRenter renter1 = new RegularRenter(1, "Hashir Ayaz", "hashir@hotmail.com", "1234567890",
                "1234, Main Street, Khi, Pakistan");
        FrequentRenter renter2 = new FrequentRenter(2, "peter parker", "spiderman@gmail.com", "1234567890",
                "Queens, New York", 0.30);// 30% discount
        CorporateRenter renter3 = new CorporateRenter(3, "Elon Musk", "elonmusk@yahoo.com", "1234567890",
                "Space, AMERIKA");// 50% discount
        renterManagement.addRenter(renter1);
        renterManagement.addRenter(renter2);
        renterManagement.addRenter(renter3);

        renterManagement.printAllRenters();

        System.out.println("All available cars are:");
        carManagement.printAllAvailableCars();

    }
}