/*Interview design problem where these is a shopping cart with items. Items can be products or coupons.
There are three coupon senarios.
1. Take X% off all items.
2. Take $N off the next item.
3. Take X% off the Nth item of type T.

Design a Cart that can total all of its items using the coupon senarios.

Sample Cart:
1. $10 Postcard
2. Coupon: Take $3 off next item.
3. Coupon: Take 10% off cart.
4. Coupon: Take 5% off Nth postcard.
5. $20 Box of business cards.
6. $15 postcard.*/
package codingexercises.couponcart;

public class CouponCart {
    public static void main(String[] args){
        Cart cart = new Cart();

        cart.add(new Product("Post cards", 10.00));
        cart.add(new CouponOne(.10));
        cart.add(new CouponTwo(2.00, cart.size() + 1));
        cart.add(new CouponThree("Post cards", .30, 2, cart.size() + 1));
        cart.add(new Product("Business Cards", 25.00));
        cart.add(new Product("Post cards", 15.00));

        System.out.println(cart);
    }
}

