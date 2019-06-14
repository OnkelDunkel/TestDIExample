package logic;

import interfaces.IPaymentHandler;

public class PaymentHandler implements IPaymentHandler {

    @Override
    public boolean doPayment(String cardNo) {
        int number;
        try {
            number = Integer.parseInt(cardNo);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
