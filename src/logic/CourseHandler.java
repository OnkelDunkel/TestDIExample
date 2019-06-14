package logic;

import interfaces.IPaymentHandler;

public class CourseHandler {

    IPaymentHandler payHandler;

    public CourseHandler(IPaymentHandler payHandler) {
        this.payHandler = payHandler;
    }

    public boolean enrollToCourse(int birthYear, String cardNo) {

        if (birthYear > 2010) return false;

        boolean isSuccess = payHandler.doPayment(cardNo);
        return isSuccess;
    }

}
