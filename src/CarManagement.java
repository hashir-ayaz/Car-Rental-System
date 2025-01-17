import java.util.ArrayList;

public class CarManagement {
    ArrayList<Car> allCars;

    public CarManagement() {
        this.allCars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.allCars.add(car);
    }

    @SuppressWarnings("unlikely-arg-type")
    public void removeCar(int carID) {
        int index = 0;
        index = allCars.indexOf(carID);
        allCars.remove(index);
    }

    public void printAllCars() {
        for (Car car : allCars) {
            car.printCar();
        }
    }

    public void setRentStatus(String carID, boolean status) {
        for (Car car : allCars) {
            if (car.getCarID() == carID) {
                car.setRentalStatus(status);
            }
        }
    }

    public Car getCar(String carID) {
        for (Car car : allCars) {
            if (car.getCarID().equals(carID)) {
                return car;
            }
        }
        System.err.println("Car not found");
        return null;
    }

    public void printAllAvailableCars() {
        for (Car car : allCars) {
            if (!car.isRentalStatus()) {
                car.printCar();
            }
        }
    }

}
