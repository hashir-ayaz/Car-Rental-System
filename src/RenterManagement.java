import java.util.ArrayList;

public class RenterManagement {
    ArrayList<Renter> allRenters;

    public RenterManagement() {
        this.allRenters = new ArrayList<>();
    }

    public void addRenter(Renter renter) {
        this.allRenters.add(renter);
    }

    public void removeRenter(int renterID) {
        int index = 0;
        index = allRenters.indexOf(renterID);
        allRenters.remove(index);
    }

    public void printAllRenters() {
        for (Renter renter : allRenters) {
            renter.printRenter();
        }
    }
}
