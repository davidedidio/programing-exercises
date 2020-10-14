package common;

public class ExerciseFail extends Exception {

    public ExerciseFail(String message) {
        super("Game Over : " + message);
    }
}
