import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Usecase5Test {

    @Test
    public void testPaymentMethodCreditCard() {
        assertTrue(usecase5.paymentmethod(100.0, "credit card"), "Payment should be successful for credit card.");
        assertTrue(usecase5.paymentmethod(50.0, "Credit Card"), "Payment should be successful for credit card with case-insensitivity.");
    }

    @Test
    public void testPaymentMethodBenefitPay() {
        assertTrue(usecase5.paymentmethod(75.0, "benefitPay"), "Payment should be successful for benefitPay.");
        assertTrue(usecase5.paymentmethod(75.0, "BenefitPay"), "Payment should be successful for benefitPay with case-insensitivity.");
    }

    @Test
    public void testPaymentMethodInvalid() {
        assertFalse(usecase5.paymentmethod(30.0, "cash"), "Payment should fail for an unsupported payment method like cash.");
        assertFalse(usecase5.paymentmethod(30.0, "paypal"), "Payment should fail for an unsupported payment method like PayPal.");
    }

    @Test
    public void testPaymentMethodEmpty() {
        assertFalse(usecase5.paymentmethod(30.0, ""), "Payment should fail for an empty payment method.");
    }
}
