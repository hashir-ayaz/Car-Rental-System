public abstract class Car {
    private int carID;
    private String brand;
    private String model;
    private int year;
    private boolean rentalStatus;
    private float rentalFee;
    private String plateNumber;

    public Car(int carID, String brand, String model, int year, boolean rentStatus, float fees, String numPlate) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalFee = fees;
        this.rentalStatus = rentStatus;
        this.plateNumber = numPlate;
    }

    // Getters
    public int getCarID() {
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

    public float getRentalFee() {
        return rentalFee;
    }

    public String getPlateNumber() {
        return plateNumber;
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

    public void setRentalFee(float rentalFee) {
        this.rentalFee = rentalFee;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public abstract void printCar();

}
