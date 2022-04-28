package classes.and.objects.modules;

import classes.and.objects.entity.Function;

import java.util.List;
import java.util.stream.Stream;

public class ConsoleWriter {
    public static void print(Function[] functions) {
        Stream.of(functions).forEach(x -> System.out.println(x.toString()));
    }

    public static void print(String message, String line) {
        System.out.printf("%s\n%S\n\n", message, line);
    }

    public static void print(String message) {
        System.out.printf("\n%s\n\n", message);
    }

    public static void print(List<Integer> indexes, Function[] functions) {
        if (indexes.size() == 0) {
            System.out.println("There is no functions for this X and Y to suit!");
        }

        for (Integer index : indexes) {
            System.out.println("Index " + index + " function: " + functions[index].toString());
        }
    }
}
