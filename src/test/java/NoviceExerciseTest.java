import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoviceExerciseTest {

    @Test
    void getName_shouldReturnName() {
        assertEquals("Max Power", NoviceExercise.getName());
    }
}