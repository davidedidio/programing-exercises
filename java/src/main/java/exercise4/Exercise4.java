package exercise4;

import common.Direction;
import common.ExerciseFail;
import common.exercise4.HedgeV4;

public class Exercise4 {

    public HedgeV4 hedgeV4 = new HedgeV4();

    int trainPosition = 10;

    public void onNewDirection(Direction arrowDirection) throws ExerciseFail {
        // TODO you are looking at the direction on the screen. Program hedge to press the button at the right time.
        hedgeV4.hitButton();
    }
}
