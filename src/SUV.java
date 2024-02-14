public class SUV extends Car {
    private double insuranceCost;
    private double damageCost;

    // constructor
    public SUV(int carID, String brand, String model, int year, boolean rentStatus, float fees, String numPlate,
            double damageCost, double insuranceCost) {
        super(carID, brand, model, year, rentStatus, fees, numPlate);
        this.damageCost = damageCost;
        this.insuranceCost = insuranceCost;
        this.setFeatures("basic SUV");
    }

    // getters

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public double getDamageCost() {
        return this.damageCost;
    }

    // setters
    public void setInsuranceCost(int insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public void setDamageCost(int damageCost) {
        this.damageCost = damageCost;
    }

    public void printCar() {
        System.out.println("The details for this car are: ");

        System.out.println("\n\t Car ID -> " + this.getCarID());
        System.out.println("\t Brand -> " + this.getBrand());
        System.out.println("\t Model -> " + this.getModel());
        System.out.println("\t Year -> " + this.getYear());
        System.out.println(isRentalStatus() ? "\t status = rented" : "\t status = not rented");
        System.out.println("\t Rental Fee -> " + this.getRentalFee());
        System.out.println("\t Plate Number -> " + this.getPlateNumber());
        System.out.println("\t Features -> " + this.getFeatures());
        System.out.println("\t Distance Travelled Cost -> " + this.getDistanceTravelledCost());
        System.out.println("\t Insurable -> " + this.isInsurable());
        System.out.println("\t Insurance Cost -> $" + this.getInsuranceCost());
        System.out.println("\t Damage Cost Percentage is -> " + this.getDamageCost());
        System.out.println("\n");

    }

    public double calculateRent() {
        return this.getRentalFee() + this.getDamageCost() + this.getInsuranceCost();
    }

}
