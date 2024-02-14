public class LuxuryCar extends Car {
    private final double insuranceCostPercentage = 0.1;
    private final double damageCostPercentage = 0.15;
    private final double luxuryTax = 50;

    public LuxuryCar(String carID, String brand, String model, int year, boolean rentalStatus, double rentalFee,
            String plateNumber) {
        super(carID, brand, model, year, rentalStatus, rentalFee, plateNumber);
    }

    // getters
    public double getLuxuryTax() {
        return luxuryTax;
    }

    public double getInsuranceCostPercentage() {
        return insuranceCostPercentage;
    }

    public double getDamageCostPercentage() {
        return damageCostPercentage;
    }

    @Override
    public double calculateRent(double distance) {
        return this.rentalFee + distance + luxuryTax;
    }

    @Override
    public boolean isInsurable() {
        return true;
    }

    // Additional methods for insurance, damage cost, and luxury tax calculations
    public double calculateInsuranceCost() {
        return this.rentalFee * this.insuranceCostPercentage;
    }

    public void printCar() {
        System.out.println("this is a LuxuryCar");
        System.out.println("the id for the car is " + this.carID);
        System.out.println("the brand for the car is " + this.brand);
        System.out.println("the model for the car is " + this.model);
        System.out.println("the year for the car is " + this.year);
        System.out.println("the rental status for the car is " + this.rentalStatus);
        System.out.println("the rental fee for the car is " + this.rentalFee);
        System.out.println("the plate number for the car is " + this.plateNumber);
        System.out.println(isInsurable() ? "The car is insurable" : "The car is not insurable");

    }
}
