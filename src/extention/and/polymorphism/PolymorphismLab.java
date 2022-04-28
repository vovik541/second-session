package extention.and.polymorphism;

import extention.and.polymorphism.entity.TNumber;

import static extention.and.polymorphism.modules.ConsoleReader.readAmountConsole;
import static extention.and.polymorphism.modules.ConsoleWriter.print;
import static extention.and.polymorphism.modules.ConsoleWriter.printTNumbers;
import static extention.and.polymorphism.modules.TNumManager.*;

public class PolymorphismLab {
    public static void main(String[] args) {

        int m = readAmountConsole("number of Integer objects M:");
        int n = readAmountConsole("number of Real objects N:");
        int size = m + n;

        print("Array size would be: " + size);

        TNumber[] tNumbers = new TNumber[size];

        fillWithIntNumbers(m, tNumbers);
        fillWithRealNumbers(m, tNumbers);

        print(String.format("tNumbers array created and filled up: by %d INT and %d REAL numbers:", m, n));
        printTNumbers(tNumbers);

        int sumOfFirstIntDigits = findSunOfFirstDigitFromIntNumbers(tNumbers);
        print(String.format("Sum of first INT digits: %d\n", sumOfFirstIntDigits));

        int sumOfLstRealDigits = findSunOfLastDigitFromRealNumbers(tNumbers);
        print(String.format("Sum of last REAL digits: %d\n", sumOfLstRealDigits));
    }
}
