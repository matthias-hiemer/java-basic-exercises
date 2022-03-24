import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoviceExerciseTest {

    @Test
    void getName_shouldReturnName() {
        assertEquals("Max Power", NoviceExercise.getName());
    }

    @Test
    void isBiggerThanZero_whenZero_shouldReturnFalse() {
        assertFalse(NoviceExercise.isBiggerThanZero(0));
    }

    @Test
    void isBiggerThanZero_whenOne_shouldReturnTrue() {
        assertTrue(NoviceExercise.isBiggerThanZero(1));
    }

    @Test
    void isBiggerThanZero_whenMinusOne_shouldReturnFalse() {
        assertFalse(NoviceExercise.isBiggerThanZero(-1));
    }

    @Test
    void calculateSquare_whenTwo_shouldReturnFour() {
        assertEquals(4, NoviceExercise.calculateSquare(2));
    }

    @Test
    void calculateSquare_whenZero_shouldReturnZero() {
        assertEquals(0, NoviceExercise.calculateSquare(1));
    }

    @Test
    void calculateSquare_whenMinusOne_shouldReturnOne() {
        assertEquals(1, NoviceExercise.calculateSquare(-1));
    }
}