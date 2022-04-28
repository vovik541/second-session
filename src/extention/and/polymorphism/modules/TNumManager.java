package extention.and.polymorphism.modules;

import extention.and.polymorphism.entity.TIntNumber;
import extention.and.polymorphism.entity.TNumber;
import extention.and.polymorphism.entity.TRealNumber;

import static extention.and.polymorphism.modules.ConsoleWriter.print;
import static extention.and.polymorphism.modules.RandomNumberGenerator.generateRandomInt;
import static extention.and.polymorphism.modules.RandomNumberGenerator.generateRandomReal;

public class TNumManager {

    public static void fillWithIntNumbers(int amount, TNumber[] tNumbers) {
        for (int i = 0; i < amount; i++) {
            tNumbers[i] = new TIntNumber(generateRandomInt());
        }
    }

    public static void fillWithRealNumbers(int from, TNumber[] tNumbers) {
        for (int i = from; i < tNumbers.length; i++) {
            tNumbers[i] = new TRealNumber(generateRandomReal());
        }
    }

    public static int findSunOfFirstDigitFromIntNumbers(TNumber[] tNumbers) {
        print("Counting sum of all INT first digit numbers");
        int sum = 0;
        int firstDigit;
        for (TNumber tNumber : tNumbers) {
            if (tNumber instanceof TIntNumber) {
                firstDigit = tNumber.findFirstDigit();
                sum += firstDigit;
                print(String.format("num= %5s firstDigit= %d sum= %d", tNumber, firstDigit, sum));
            }
        }
        return sum;
    }

    public static int findSunOfLastDigitFromRealNumbers(TNumber[] tNumbers) {
        print("Counting sum of all INT first digit numbers");
        int sum = 0;
        int lastDigit;
        for (TNumber tNumber : tNumbers) {
            if (tNumber instanceof TRealNumber) {
                lastDigit = tNumber.findLastDigit();
                sum += lastDigit;
                print(String.format("num= %8s lastDigit= %d sum= %d", tNumber, lastDigit, sum));
            }
        }
        return sum;
    }
}
