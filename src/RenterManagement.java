import java.util.ArrayList;

public class RenterManagement {
    ArrayList<Renter> allRenters;

    public RenterManagement() {
        this.allRenters = new ArrayList<>();
    }

    public void addRenter(Renter renter) {
        this.allRenters.add(renter);
    }

    @SuppressWarnings("unlikely-arg-type")
    public void removeRenter(int renterID) {
        int index = 0;
        index = allRenters.indexOf(renterID);
        allRenters.remove(index);
    }

    public Renter getRenter(String name) {
        for (Renter renter : allRenters) {
            if (renter.getName().equals(name)) {
                return renter;
            }
        }
        System.err.println("Renter not found");
        return null;

    }

    public void printAllRenters() {
        for (Renter renter : allRenters) {
            renter.printRenter();
        }
    }
}
