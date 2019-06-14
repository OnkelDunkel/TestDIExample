package mocks;

import interfaces.IPaymentHandler;

public class PaymentHandlerMock implements IPaymentHandler {

    private boolean successResult;

    public PaymentHandlerMock(boolean successResult) {
        this.successResult = successResult;
    }

    @Override
    public boolean doPayment(String cardNo) {
        return successResult;
    }
}
