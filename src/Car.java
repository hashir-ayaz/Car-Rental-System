public abstract class Car {
    protected String carID;
    protected String brand;
    protected String model;
    protected int year;
    protected boolean rentalStatus;
    protected double rentalFee;
    protected String plateNumber;

    public Car(String carID, String brand, String model, int year, boolean rentalStatus, double rentalFee,
            String plateNumber) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalStatus = rentalStatus;
        this.rentalFee = rentalFee;
        this.plateNumber = plateNumber;
    }

    public abstract double calculateRent(double distance);

    public boolean isInsurable() {
        return false; // false by default
    }

    public abstract void printCar();

    // Getters
    public String getCarID() {
        return carID;
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

    public double getRentalFee() {
        return rentalFee;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    // Setters
    public void setCarID(String carID) {
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

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public abstract double getDamageCostInsured();

    public abstract double getDamageCostUninsured();
}
