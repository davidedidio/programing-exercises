package exercise3;

import common.ExerciseFail;
import common.exercise3.FurnaceBot;
import common.exercise3.HedgeV3;

public class Exercise3 {

    public HedgeV3 hedgeV3 = new HedgeV3();

    public FurnaceBot procedure() throws ExerciseFail {
        // TODO implement the procedure to find the master bot.
        return hedgeV3.findFurnaceBotWithShellSerialNumber(0);
    }

}
