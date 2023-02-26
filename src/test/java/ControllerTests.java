import com.adamkali.server.Controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ControllerTests {

    @Test
    public void testController() {
        // Create Controller from Command Line Arguments
        // Valid Arguments
        String[] args = {"1234", "3", "1000", "1000"};
        assertDoesNotThrow(() -> Controller.main(args));
        // Missing Arguments
        String[] args2 = {"1234", "3", "1000"};
        assertThrows(RuntimeException.class, () -> Controller.main(args2));
        // Invalid Arguments
        String[] args3 = {"1234", "3", "1000", "1000", "1000"};
        assertThrows(RuntimeException.class, () -> Controller.main(args3));
        String[] args4 = {"aaaa", "3", "1000", "1000"};
        // Assert exception
        assertThrows(NumberFormatException.class, () -> Controller.main(args4));
    }
}
