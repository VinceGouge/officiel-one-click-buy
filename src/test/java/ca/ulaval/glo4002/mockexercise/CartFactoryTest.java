package ca.ulaval.glo4002.mockexercise;

import ca.ulaval.glo4002.mockexercise.do_not_edit.CartFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartFactoryTest {



    @Test
    public void givenCartFactory_whenCreatedCart_thenCartIsReturned() {
        CartFactory cartFactory = new CartFactory();

        String email = "test";
        Cart cart = cartFactory.create(email);

        assertTrue(cart != null);
    }

    @Test
    public void givenAnEmail_whenCreatingCartFromFactory_thenCartHasTheEmail() {
        CartFactory cartFactory = new CartFactory();

        String email = "test";
        Cart cart = cartFactory.create(email);

        assertEquals(email, cart.getEmail());
    }
}
