public abstract class Car {
    private int carID;
    private String brand;
    private String model;
    private int year;
    private boolean rentalStatus;
    private float rentalFee;
    private String plateNumber;
    private boolean isInsurable;
    private String features;
    private double distanceTravelledCost;

    public Car(int carID, String brand, String model, int year, boolean rentStatus, float fees, String numPlate) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalFee = fees;
        this.rentalStatus = rentStatus;
        this.plateNumber = numPlate;
        this.isInsurable = true;
        this.features = "";
        this.distanceTravelledCost = 0.0;

    }

    // Getters
    public int getCarID() {
        return this.carID;
    }

    public boolean isInsurable() {
        return this.isInsurable;
    }

    public String getFeaturesList() {
        return this.features;
    }

    public double getDistanceTravelledCost() {
        return this.distanceTravelledCost;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isRentalStatus() {
        return rentalStatus;
    }

    public float getRentalFee() {
        return rentalFee;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getFeatures() {
        return this.features;
    }

    // Setters
    public void setCarID(int carID) {
        this.carID = carID;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRentalStatus(boolean rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public void setInsurable(boolean insurable) {
        this.isInsurable = insurable;
    }

    public void setRentalFee(float rentalFee) {
        this.rentalFee = rentalFee;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setFeatures(String s) {
        this.features = s;
    }

    public void setDistanceTravelledCost(double cost) {
        this.distanceTravelledCost = cost;
    }

    public abstract void printCar();

    public abstract double calculateRent();

}
