package exercise1;

import common.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise1Test {

    @Test
    public void testThatProcedureIsCorrect() {
        for (int i = 0; i < 10; ++i) {
            Exercise1 clazz = new Exercise1();
            clazz.procedure();
            assertEquals(Color.GREEN, clazz.hedgeV1.checkColor());
        }
    }

    @Test
    public void testThatProcedureIsCorrectIfExecutedTwice() {
        for (int i = 0; i < 10; ++i) {
            Exercise1 clazz = new Exercise1();
            clazz.procedure();
            clazz.procedure();
            assertEquals(Color.GREEN, clazz.hedgeV1.checkColor());
        }
    }
}