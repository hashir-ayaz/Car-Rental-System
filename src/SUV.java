public class SUV extends Car {
    private final double insuranceCostPercentage = 0.05; // Example value
    private final double damageCostPercentage = 0.1; // Example value

    public SUV(String carID, String brand, String model, int year, boolean rentalStatus, double rentalFee,
            String plateNumber) {
        super(carID, brand, model, year, rentalStatus, rentalFee, plateNumber);
    }

    // getters
    public double getInsuranceCostPercentage() {
        return insuranceCostPercentage;
    }

    public double getDamageCostPercentage() {
        return damageCostPercentage;
    }

    public double getDamageCostUninsured() {
        return getRentalFee() * getDamageCostPercentage();
    }

    public double getDamageCostInsured() {
        return getRentalFee() * getDamageCostPercentage() - calculateInsuranceCost();
    }

    @Override
    public double calculateRent(double distance) {
        return this.rentalFee + distance;
    }

    @Override
    public boolean isInsurable() {
        return true;
    }

    public double calculateInsuranceCost() {
        return getRentalFee() * getInsuranceCostPercentage();
    }

    public void printCar() {
        System.out.println("\t-------------------");
        System.out.println("\tthis is an SUV");
        System.out.println("\tthe id for the car is " + this.carID);
        System.out.println("\tthe brand for the car is " + this.brand);
        System.out.println("\tthe model for the car is " + this.model);
        System.out.println("\tthe year for the car is " + this.year);
        System.out.println("\tthe rental status for the car is " + this.rentalStatus);
        System.out.println("\tthe rental fee for the car is " + this.rentalFee);
        System.out.println("\tthe plate number for the car is " + this.plateNumber);
        System.out.println(isInsurable() ? "\tThe car is insurable" : "\tThe car is not insurable");
    }
}
