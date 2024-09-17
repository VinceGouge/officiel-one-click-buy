package ca.ulaval.glo4002.mockexercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    private Cart cart;
    private static Product product;

    @BeforeAll
    public static void beforeAllSetUp(){
        String sku = "345345";
        String name = "test";
        double price = 234;

        product = new Product(sku, name, price);
    }


    @BeforeEach
    public void setUp() {
        String email = "test@test.com";
        cart = new Cart(email);
    }

    @Test
    public void whenCreatingANewCart_thenCartIsEmpty() {

        assertTrue(cart.getProducts().isEmpty());
    }

    @Test
    public void givenAnEmptyCart_whenAddingANewProduct_cartIsNotEmpty() {

        cart.addProduct(product);

        assertFalse(cart.getProducts().isEmpty());
    }

    @Test
    public void givenAnEmptyCart_whenAddingANewProduct_cartContainsTheProduct() {

        cart.addProduct(product);

        assertTrue(cart.getProducts().contains(product));
    }

    @Test
    public void givenAnEmptyCart_whenAddingANewProduct_cartContainsOnlyTheProduct() {
        cart.addProduct(product);

        assertEquals(1, cart.getProducts().size());
    }
}
