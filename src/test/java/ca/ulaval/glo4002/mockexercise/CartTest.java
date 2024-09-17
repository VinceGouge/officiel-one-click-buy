package ca.ulaval.glo4002.mockexercise;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    @Test
    public void givenAnEmail_whenCreatingANewCart_thenCartIsEmpty() {
        String email = "test@test.com";
        Cart cart = new Cart(email);

        assertTrue(cart.getProducts().isEmpty());
    }
    
}
