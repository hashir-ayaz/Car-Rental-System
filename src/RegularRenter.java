public class RegularRenter extends Renter {

    public RegularRenter(int renterID, String name, String email, String phoneNumber, String address) {
        super(renterID, name, email, phoneNumber, address);
    }

    @Override
    public void printRenter() {
        System.out.println("The details for this renter are: ");
        System.out.println("--------------------------------------------");
        System.out.println("Renter ID -> " + this.getRenterID());
        System.out.println("Name -> " + this.getName());
        System.out.println("Email -> " + this.getEmail());
        System.out.println("Phone Number -> " + this.getPhoneNumber());
        System.out.println("Address -> " + this.getAddress());
        System.out.println("--------------------------------------------");

    }

}
