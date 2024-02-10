public class FrequentRenter extends Renter {
    float discountRate;

    public FrequentRenter(int renterID, String name, String email, String phoneNumber, String address,
            float discountRate) {
        super(renterID, name, email, phoneNumber, address);
        this.discountRate = discountRate;
    }

    public float getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(float discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public void printRenter() {
        System.out.println("the details for this renter are: ");
        System.out.println("Renter ID -> " + this.getRenterID());
        System.out.println("Name -> " + this.getName());
        System.out.println("Email -> " + this.getEmail());
        System.out.println("Phone Number -> " + this.getPhoneNumber());
        System.out.println("Address -> " + this.getAddress());
        System.out.println("Discount Rate -> " + this.getDiscountRate());
    }
}
