public class LuxuryCar extends Car {
    private final double insuranceCostPercentage = 0.1;
    private final double damageCostPercentage = 0.15;
    private final double luxuryTax = 50; // $50 adding to total

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

    public double getDamageCostUninsured() {
        return this.rentalFee * this.damageCostPercentage;
    }

    public double getDamageCostInsured() {
        return this.rentalFee * this.damageCostPercentage - calculateInsuranceCost();
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
        System.out.println("\t-------------------");
        System.out.println("\tthis is a LuxuryCar");
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
