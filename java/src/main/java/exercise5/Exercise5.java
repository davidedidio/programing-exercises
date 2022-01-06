package exercise5;


import common.ExerciseFail;
import common.exercise5.HedgeV5;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Exercise5 {

    private final HedgeV5 hedgeV5;

    public void procedure(int imageSide) throws ExerciseFail {
        // TODO use hedge instruction set to draw a cross on the canvas.
        hedgeV5.paint();
        hedgeV5.moveForward();
        hedgeV5.paint();
        hedgeV5.moveForward();
        hedgeV5.paint();
        hedgeV5.moveForward();
        hedgeV5.paint();
        hedgeV5.turnRight();
        hedgeV5.moveForward();
        hedgeV5.paint();
        hedgeV5.moveForward();
        hedgeV5.paint();
    }

    /**
     * Execute the main method to see the result.
     */
    public static void main(String[] args) throws ExerciseFail {
        int imageSide = 45;
        Exercise5 exercise5 = new Exercise5(new HedgeV5(imageSide));
        exercise5.procedure(imageSide);
    }
}
