package trees.modules;

import extention.and.polymorphism.entity.TNumber;

import java.util.List;

public class ConsoleWriter {
    public static void print(List<String> lines) {
        lines.forEach(System.out::println);
        System.out.println();
    }

    public static void print(String message, String line) {
        System.out.printf("%s\n%S\n\n", message, line);
    }

    public static void print(String message) {
        System.out.printf("%s\n", message);
    }

    public static void printTNumbers(TNumber[] tNumbers) {
        for (int i = 0; i < tNumbers.length; i++) {
            System.out.printf("i= %d num= %s\n", i, tNumbers[i].toString());
        }
        System.out.println();
    }
}
