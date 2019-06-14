import logic.CourseHandler;
import logic.PaymentHandler;

public class Main {
    public static void main(String[] args) {
        PaymentHandler payHandler = new PaymentHandler();
        CourseHandler courseHandler = new CourseHandler(payHandler);
        System.out.println(courseHandler.enrollToCourse(2001, "235244655675"));
    }
}
