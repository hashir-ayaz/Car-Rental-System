import java.util.ArrayList;
// import java.util.List;

public abstract class Renter {
    private int renterID;
    private String name;
    private String email;
    private ArrayList<Car> rentedCars;
    private double totalRentalFee;
    private String phoneNumber;
    private String address;

    public Renter(int renterID, String name, String email, String phoneNumber, String address) {
        this.renterID = renterID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.rentedCars = new ArrayList<>();
        this.totalRentalFee = 0.0;
    }

    // Getter methods
    public int getRenterID() {
        return renterID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Car> getRentedCars() {
        return rentedCars;
    }

    public double getTotalRentalFee() {
        return totalRentalFee;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods
    public void setRenterID(int rID) {
        this.renterID = rID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String emailID) {
        this.email = emailID;
    }

    public void setRentedCars(ArrayList<Car> rentedCars) {
        this.rentedCars = rentedCars;
    }

    public void setTotalRentalFee(double totalRentalFee) {
        this.totalRentalFee = totalRentalFee;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void rentCar(Car car) {
        this.rentedCars.add(car);
    }

    public void returnCar(Car car) {
        this.rentedCars.remove(car);
    }

    public void printRenter() {
        System.out.println("the details for this renter are: ");
        System.out.println("Renter ID -> " + this.getRenterID());
        System.out.println("Name -> " + this.getName());
        System.out.println("Email -> " + this.getEmail());
        System.out.println("Phone Number -> " + this.getPhoneNumber());
        System.out.println("Address -> " + this.getAddress());
    }
}