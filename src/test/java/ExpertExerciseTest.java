import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpertExerciseTest {

    @Test
    void reverse() {
        assertEquals("cba", ExpertExercise.reverse("abc"));
    }

    @Test
    void sortArray() {
        assertArrayEquals(new int[]{2, 3, 6, 6, 8, 9}, ExpertExercise.sortArray());
    }

    @Test
    void splitStringOnComma() {
        assertArrayEquals(new String[]{"Hallo", " Welt"}, ExpertExercise.splitStringOnComma("Hallo, Welt"));
    }

    @Test
    void decimalToRoman_when1985() {
        assertEquals("MCMLXXXV", ExpertExercise.decimalToRoman(1985));
    }

    @Test
    void decimalToRoman_when1() {
        assertEquals("I", ExpertExercise.decimalToRoman(1));
    }


    @Test
    void checkSum_789() {
        assertEquals(24, ExpertExercise.checkSum(789));
    }

    @Test
    void checkSum_0() {
        assertEquals(0, ExpertExercise.checkSum(0));
    }

    @Test
    void checkSum_1() {
        assertEquals(1, ExpertExercise.checkSum(1));
    }

    @Test
    void checkSum_negativeNumbers() {
        assertEquals(-6, ExpertExercise.checkSum(-123));
    }
}