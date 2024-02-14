import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLuxuryCar {

    private LuxuryCar luxuryCar;

    @Before
    public void setUp() {
        luxuryCar = new LuxuryCar("LX123", "Mercedes", "S-Class", 2020, true, 100.0, "ABC123");
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("LX123", luxuryCar.getCarID());
        assertEquals("Mercedes", luxuryCar.getBrand());
        assertEquals("S-Class", luxuryCar.getModel());
        assertEquals(2020, luxuryCar.getYear());
        assertTrue(luxuryCar.isRentalStatus());
        assertEquals(100.0, luxuryCar.getRentalFee(), 0.0);
        assertEquals("ABC123", luxuryCar.getPlateNumber());
    }

    @Test
    public void testCalculateRent() {
        // Assuming the distance is 100 miles
        double distance = 100.0;
        double expectedRent = 100.0 + distance + luxuryCar.getLuxuryTax(); // RentalFee + Distance + LuxuryTax
        assertEquals(expectedRent, luxuryCar.calculateRent(distance), 0.0);
    }

    @Test
    public void testIsInsurable() {
        assertTrue(luxuryCar.isInsurable());
    }

    @Test
    public void testCalculateInsuranceCost() {
        double expectedInsuranceCost = luxuryCar.getRentalFee() * luxuryCar.getInsuranceCostPercentage();
        assertEquals(expectedInsuranceCost, luxuryCar.calculateInsuranceCost(), 0.0);
    }

    @Test
    public void testGetDamageCostUninsured() {
        double expectedDamageCostUninsured = luxuryCar.getRentalFee() * luxuryCar.getDamageCostPercentage();
        assertEquals(expectedDamageCostUninsured, luxuryCar.getDamageCostUninsured(), 0.0);
    }

    @Test
    public void testGetDamageCostInsured() {
        double expectedDamageCostInsured = luxuryCar.getRentalFee() * luxuryCar.getDamageCostPercentage()
                - luxuryCar.calculateInsuranceCost();
        assertEquals(expectedDamageCostInsured, luxuryCar.getDamageCostInsured(), 0.0);
    }

}
