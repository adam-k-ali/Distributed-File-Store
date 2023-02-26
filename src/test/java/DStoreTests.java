import com.adamkali.server.DStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DStoreTests {
    @Test
    public void testDStore() {
        // Create DStore from Command Line Arguments
        // Valid Arguments
        String[] args = {"1234", "1234", "1000", "test"};
        assertDoesNotThrow(() -> DStore.main(args));
        // Missing Arguments
        String[] args2 = {"1234", "1234", "1000"};
        assertThrows(RuntimeException.class, () -> DStore.main(args2));
        // Invalid Arguments
        String[] args3 = {"1234", "1234", "1000", "test", "test"};
        assertThrows(RuntimeException.class, () -> DStore.main(args3));
        String[] args4 = {"aaaa", "1234", "1000", "test"};
        // Assert exception
        assertThrows(NumberFormatException.class, () -> DStore.main(args4));
    }
}
