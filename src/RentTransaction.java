// import java.util.List;

public class RentTransaction {
    // sort of acts like a receipt
    // stores one rental transaction between Car and renter
    int numDaysRented;
    double totalCost;
    double distanceTravelled;
    boolean hasDamage;
    Renter renter;
    Car car;
    double damageCost;

    public RentTransaction(Renter renter, Car car, int numDaysRented, boolean damaged, double distanceTravelled) {
        this.renter = renter;
        this.car = car;
        this.numDaysRented = numDaysRented;
        this.damageCost = 0.0;
        this.distanceTravelled = distanceTravelled;
        this.hasDamage = damaged;
        this.totalCost = 0.0;

    }

    // getters
    public int getNumDaysRented() {
        return numDaysRented;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getDamageCost() {
        return damageCost;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public boolean isHasDamage() {
        return hasDamage;
    }

    public Renter getRenter() {
        return renter;
    }

    public Car getCar() {
        return car;
    }

    // setters

    public void setNumDaysRented(int numDaysRented) {
        this.numDaysRented = numDaysRented;
    }

    public void setDamageCost(double damageCost) {
        this.damageCost = damageCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public void setHasDamage(boolean hasDamage) {
        this.hasDamage = hasDamage;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double calculateTotalCost(Boolean insured) {
        double cost = 0.0;
        cost = this.getCar().getRentalFee() * this.getNumDaysRented();
        this.setTotalCost(cost);

        if (hasDamage) {
            if (insured) {
                cost += this.getCar().getDamageCostInsured();
            } else {
                cost += this.getCar().getDamageCostUninsured();
            }
        }
        return this.getTotalCost();
    }

    public void printTransaction() {
        System.out.println("The details for this transaction are: ");
        System.out.println("\tRenter " + this.getRenter().getName() + " has rented the car with ID "
                + this.getCar().getCarID() + " for " + this.getNumDaysRented() + " days.");
        System.out.println("\tThe total cost for this transaction is $" + calculateTotalCost(true));
        System.out.println("\tThe distance travelled cost is " + this.getDistanceTravelled());
        System.out.println("\tThe damage status is " + this.isHasDamage() + "\n");
    }

    public void returnCar() {
        System.out.println(
                "The car with ID " + this.getCar().getCarID() + " has been returned by " + this.getRenter().getName());
        this.getCar().setRentalStatus(false);

    }

}
