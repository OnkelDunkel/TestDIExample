import logic.CourseHandler;
import mocks.PaymentHandlerMock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseHandlerTest {

    PaymentHandlerMock payMock = new PaymentHandlerMock(true);
    CourseHandler handler = new CourseHandler(payMock);

    @Test
    void enrollToCourseSuccess() {
        boolean wasSuccesfull = handler.enrollToCourse(1990, "22ssdsd");
        assertTrue(wasSuccesfull);
    }

    @Test
    void enrollToCourseNotOldEnough() {
        boolean wasSuccesfull = handler.enrollToCourse(2016, "");
        assertFalse(wasSuccesfull);
    }
}