package exercise4;

import common.ExerciseFail;
import common.exercise4.Train;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("StatementWithEmptyBody")
class Exercise4Test {


    @Test
    public void testThatProcedureIsCorrect() throws ExerciseFail {
        for (int i = 0; i < 10; ++i) {
            Train train = new Train();
            while (train.moveTrain() && train.getTrainPosition() > -10) ;
            assertEquals(0, train.getTrainPosition(), "You missed the energy crystal...");
        }
    }

}