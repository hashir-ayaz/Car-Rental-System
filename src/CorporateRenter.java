public class CorporateRenter extends Renter {
    int specialRate;

    public CorporateRenter(int renterID, String name, String email, String phoneNumber, String address) {
        super(renterID, name, email, phoneNumber, address);
        this.specialRate = 100;// $100 USD off for corporate renters
    }

    // getters
    public int getSpecialRate() {
        return specialRate;
    }

    // setters
    public void setSpecialRate(int specialRate) {
        this.specialRate = specialRate;
    }

    @Override
    public void printRenter() {
        System.out.println("the details for this renter are: ");
        System.out.println("--------------------------------------------");
        System.out.println("Renter ID -> " + this.getRenterID());
        System.out.println("Name -> " + this.getName());
        System.out.println("Email -> " + this.getEmail());
        System.out.println("Phone Number -> " + this.getPhoneNumber());
        System.out.println("Address -> " + this.getAddress());
        System.out.println("Special Rate -> " + this.getSpecialRate());
        System.out.println("--------------------------------------------");

    }

}
