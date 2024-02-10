import java.util.ArrayList;

public class CarManagement {
    ArrayList<Car> allCars;

    public CarManagement() {
        this.allCars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.allCars.add(car);
    }

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

    public void printAllAvailableCars() {
        for (Car car : allCars) {
            if (!car.isRentalStatus()) {
                car.printCar();
            }
        }
    }
}
