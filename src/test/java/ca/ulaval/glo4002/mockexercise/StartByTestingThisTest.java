package ca.ulaval.glo4002.mockexercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StartByTestingThisTest {

    private StartByTestingThis service;

    @BeforeEach
    public void setUp() {
        service = new StartByTestingThis();
    }

    @Test
    public void givenAnEmailAndProduct_whenOneClickBuy_thenTheInvoiceIsReturned() {
        String email = "test@test.com";

    }
}
