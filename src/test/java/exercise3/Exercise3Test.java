package exercise3;

import common.ExerciseFail;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise3Test {

    @Test
    public void testThatProcedureIsCorrect() throws ExerciseFail {
        for (int i = 0; i < 10; ++i) {
            Exercise3 exercise3 = new Exercise3();
            assertEquals(0, exercise3.procedure().getFurnaceNumber());
        }
    }

}