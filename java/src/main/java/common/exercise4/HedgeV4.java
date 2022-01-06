package common.exercise4;

public class HedgeV4 {

    private boolean isButtonPressed = false;

    public void hitButton() {
        isButtonPressed = true;
    }

    boolean isButtonPressed() {
        return isButtonPressed;
    }
}
