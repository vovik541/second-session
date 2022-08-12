package extention.and.polymorphism.modules;

import java.util.Random;

public class RandomNumberGenerator {

    public static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt() % 101;
    }

    public static float generateRandomReal() {
        Random random = new Random();
        return random.nextFloat() * 10000;
    }
}
