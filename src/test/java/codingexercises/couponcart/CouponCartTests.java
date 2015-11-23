package codingexercises.couponcart;

import codingexercises.couponcart.CouponCart;
import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CouponCartTests {
    
    @Test
    public void CalculateTotalTest() {
        double DELTA    = 0.001;
        double EXPECTED = 38.95;

        Cart cart = new Cart();

        cart.add(new Product("Post cards", 10.00));
        cart.add(new CouponOne(.10));
        cart.add(new CouponTwo(2.00, cart.size() + 1));
        cart.add(new CouponThree("Post cards", .30, 2, cart.size() + 1));
        cart.add(new Product("Business Cards", 25.00));
        cart.add(new Product("Post cards", 15.00));

        assertEquals(EXPECTED, cart.calculateTotal(), DELTA);
    }

    @Test
    public void ToStringTest() {
        String EXPECTED = "0: $10.0 Post cards\n"
            + "1: Coupon: Take 10.0% off all items.\n"
            + "2: Coupon: Take $2.0 off next item.\n"
            + "3: Coupon: Take 30.0% off all 2nd item of type 'Post cards'.\n"
            + "4: $25.0 Business Cards\n"
            + "5: $15.0 Post cards\n"
            + "---------------------------------\n"
            + "Total: $38.95";

        Cart cart = new Cart();

        cart.add(new Product("Post cards", 10.00));
        cart.add(new CouponOne(.10));
        cart.add(new CouponTwo(2.00, cart.size() + 1));
        cart.add(new CouponThree("Post cards", .30, 2, cart.size() + 1));
        cart.add(new Product("Business Cards", 25.00));
        cart.add(new Product("Post cards", 15.00));

        assertEquals(EXPECTED, cart.toString());
    }
}