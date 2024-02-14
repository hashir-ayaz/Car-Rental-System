public class CompactCar extends Car {
    public CompactCar(String carID, String brand, String model, int year, boolean rentalStatus, double rentalFee,
            String plateNumber) {
        super(carID, brand, model, year, rentalStatus, rentalFee, plateNumber);
    }

    @Override
    public double calculateRent(double distance) {
        return this.rentalFee + distance;
    }

    public void printCar() {
        System.out.println("\tCompactCar");
        System.out.println("\tthe id for the car is " + this.carID);
        System.out.println("\tthe brand for the car is " + this.brand);
        System.out.println("\tthe model for the car is " + this.model);
        System.out.println("\tthe year for the car is " + this.year);
        System.out.println("\tthe rental status for the car is " + this.rentalStatus);
        System.out.println("\tthe rental fee for the car is " + this.rentalFee);
        System.out.println("\tthe plate number for the car is " + this.plateNumber);
        System.out.println(isInsurable() ? "The car is insurable" : "The car is not insurable");

    }
}
