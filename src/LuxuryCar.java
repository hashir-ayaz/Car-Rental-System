public class LuxuryCar extends Car {
    private boolean insurable;
    private float distanceTravelledCost;
    private String features;
    private double damageCost;
    private double insuranceCost;

    public LuxuryCar(int carID, String brand, String model, int year, boolean rentStatus, float baseRent,
            String numPlate, String featureList) {
        super(carID, brand, model, year, rentStatus, baseRent, numPlate);
        this.insurable = true;
        this.distanceTravelledCost = 0.0f;
        this.features = featureList;
        this.damageCost = 0.3;
        this.insuranceCost = 0.2 * baseRent; // 20% of rental fee
    }

    // getters
    public boolean isInsurable() {
        return insurable;
    }

    public float getDistanceTravelledCost() {
        return distanceTravelledCost;
    }

    public String getFeatures() {
        return this.features;
    }

    public double getDamageCost() {
        return damageCost;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    // setters
    public void setInsurable(boolean insurable) {
        this.insurable = insurable;
    }

    public void setDistanceTravelledCost(float distanceTravelledCost) {
        this.distanceTravelledCost = distanceTravelledCost;
    }

    public void setFeatures(String featureList) {
        this.features = featureList;
    }

    public void setDamageCost(int damageCost) {
        this.damageCost = damageCost;
    }

    public void setInsuranceCost(int insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    @Override
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
        // System.out.println("\t Damage Cost -> " + this.getDamageCost());
        System.out.println("\n");
    }
}
