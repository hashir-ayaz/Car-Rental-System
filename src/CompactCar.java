public class CompactCar extends Car {

    public CompactCar(int carID, String brand, String model, int year, boolean rentStatus, float fees,
            String numPlate, String featureList) {
        super(carID, brand, model, year, rentStatus, fees, numPlate);
        this.setInsurable(false);
        this.setDistanceTravelledCost((5 / 100) * fees); // 5% of base rent
        this.setFeatures("compact car features");

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
        System.out.println("\n");

    }

    @Override
    public double calculateRent() {
        return getRentalFee() + getDistanceTravelledCost();
    }

}