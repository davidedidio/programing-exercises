package common.exercise2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class Exercise2HelperTest {
    private final Exercise2Helper exercise2Helper = new Exercise2Helper();

    @Test
    public void testVowelCount() {
        assertEquals(3, exercise2Helper.countVowels("Davide"));
        assertEquals(2, exercise2Helper.countVowels("Simon"));
        assertEquals(1, exercise2Helper.countVowels("John"));
        assertEquals(6, exercise2Helper.countVowels("Not a name but still"));
    }

    @Test
    public void testTwoConsecutiveLetters() {
        assertTrue(exercise2Helper.hasTwoConsecutiveLetters("Aaron"));
        assertTrue(exercise2Helper.hasTwoConsecutiveLetters("Abby"));
        assertFalse(exercise2Helper.hasTwoConsecutiveLetters("Davide"));
        assertFalse(exercise2Helper.hasTwoConsecutiveLetters("Simon"));
    }
}