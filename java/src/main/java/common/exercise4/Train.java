package common.exercise4;

import common.Direction;
import common.ExerciseFail;
import exercise4.Exercise4;
import lombok.Getter;

import java.util.Random;

public class Train {

    Exercise4 exercise4 = new Exercise4();
    private Random rnd = new Random();
    @Getter
    private int trainPosition = 10;

    public boolean moveTrain() throws ExerciseFail {
        if (exercise4.hedgeV4.isButtonPressed()) {
            return false;
        }
        double randomNumber = rnd.nextDouble();
        if (randomNumber < 0.6) {
            trainPosition--;
            exercise4.onNewDirection(Direction.RIGHT);
        } else {
            trainPosition++;
            exercise4.onNewDirection(Direction.LEFT);
        }
        return true;
    }

}
