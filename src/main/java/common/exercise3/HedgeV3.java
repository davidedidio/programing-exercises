package common.exercise3;

import common.ExerciseFail;

import java.util.*;
import java.util.stream.Collectors;

public class HedgeV3 {

    private static final int NUMBER_OF_FURNACE_BOTS = 1000;
    private static final int MAX_SERIAL_NUMBER = 100000;
    private final List<FurnaceBot> furnaceBots = generateFurnaceBots();

    public List<Integer> seeAllSerialNumbers() {
        return furnaceBots.stream().map(FurnaceBot::getShellSerialNumber).collect(Collectors.toList());
    }

    public FurnaceBot findFurnaceBotWithShellSerialNumber(int shellSerialNumber) throws ExerciseFail {
        return furnaceBots.stream()
                .filter(x -> x.getShellSerialNumber() == shellSerialNumber)
                .findFirst()
                .orElseThrow(() -> new ExerciseFail("The given serial number does not exist, you did not find the furnace bot."));
    }

    private List<FurnaceBot> generateFurnaceBots() {
        Random rnd = new Random();
        List<FurnaceBot> botList = new ArrayList<>(NUMBER_OF_FURNACE_BOTS);
        Set<Integer> usedSerialNumbers = new HashSet<>();

        FurnaceBot masterFurnaceBot = createNewFurnaceBot(rnd, usedSerialNumbers, 0);
        botList.add(masterFurnaceBot);
        usedSerialNumbers.add(masterFurnaceBot.getShellSerialNumber());

        for (int i = 0; i < 999; ++i) {
            int newFurnaceNumber = getRandomElementFromSet(usedSerialNumbers, rnd);
            FurnaceBot furnaceBot = createNewFurnaceBot(rnd, usedSerialNumbers, newFurnaceNumber);
            botList.add(furnaceBot);
            usedSerialNumbers.add(furnaceBot.getShellSerialNumber());
        }
        return botList;
    }

    private FurnaceBot createNewFurnaceBot(Random rnd, Set<Integer> usedSerialNumber, int furnaceNumber) {
        int shellSerialNumber = rnd.nextInt(MAX_SERIAL_NUMBER) + 1;
        while (usedSerialNumber.contains(shellSerialNumber)) {
            shellSerialNumber = rnd.nextInt(MAX_SERIAL_NUMBER) + 1;
        }
        return new FurnaceBot(shellSerialNumber, furnaceNumber);
    }

    private <T> T getRandomElementFromSet(Set<T> set, Random rnd) {
        int item = rnd.nextInt(set.size());
        int i = 0;
        for (T obj : set) {
            if (i == item)
                return obj;
            i++;
        }
        throw new IllegalArgumentException("Set is empty");
    }
}
