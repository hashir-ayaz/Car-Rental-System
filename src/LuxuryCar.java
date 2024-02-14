public class LuxuryCar extends Car {
    private double damageCost;
    private double insuranceCost;

    // constructor
    public LuxuryCar(int carID, String brand, String model, int year, boolean rentStatus, float fees, String numPlate,
            double damageCost, double insuranceCost) {
        super(carID, brand, model, year, rentStatus, fees, numPlate);
        this.damageCost = damageCost;
        this.insuranceCost = insuranceCost;
        this.setFeatures("Luxury Car Features");
    }

    // Getters
    public double getDamageCost() {
        return this.damageCost;
    }

    public double getInsuranceCost() {
        return this.insuranceCost;
    }

    // Setters

    public void setDamageCost(double damageCost) {
        this.damageCost = damageCost;
    }

    public void setInsuranceCost(double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public double calculateTotalCost() {
        return this.getRentalFee() + this.getDamageCost() + this.getInsuranceCost();
    }

    public void printCar() {
        System.out.println("Car ID-> " + this.getCarID());
        System.out.println("Brand-> " + this.getBrand());
        System.out.println("Model-> " + this.getModel());
        System.out.println("Year-> " + this.getYear());
        System.out.println("Insurable->" + this.isInsurable());

    }

    public double calculateRent() {
        return getRentalFee() + getDamageCost();

    }

}