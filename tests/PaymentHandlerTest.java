import logic.PaymentHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentHandlerTest {

    PaymentHandler handler = new PaymentHandler();

    @Test
    void doPaymentSuccess() {
        boolean wasSuccess = handler.doPayment("1212");
        assertTrue(wasSuccess);
    }

    @Test
    void doPaymentFail() {
        boolean wasSuccess = handler.doPayment("121w2");
        assertFalse(wasSuccess);
    }
}