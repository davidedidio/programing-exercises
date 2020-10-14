package exercise1;

import common.Color;

import java.util.Random;

public class Exercise1Lock {

    private final static int LOCK_TOTAL_COUNT = 100;
    private final static int LOCK_SOLUTION = new Random().nextInt(LOCK_TOTAL_COUNT);

    private int lockPosition = 0;

    /**
     * Return the color on the lock (green or red)
     */
    public Color checkColor() {
        return lockPosition == LOCK_SOLUTION ? Color.GREEN : Color.RED;
    }

    /**
     * Spin the Dial
     */
    public void spinDial() {
        lockPosition = (lockPosition + 1) % LOCK_TOTAL_COUNT;
    }

}
