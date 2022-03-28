package exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testfactorial_0() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    void testfactorial_1() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    void testfactorial_2() {
        assertEquals(2, Factorial.factorial(2));
    }

    @Test
    void testfactorial_3() {
        assertEquals(6, Factorial.factorial(3));
    }

    @Test
    void testfactorial_10() {
        assertEquals(3628800, Factorial.factorial(10));
    }

    @Test
    void testfactorial_negativeNumber() {
        assertEquals(1, Factorial.factorial(-1));
    }

}