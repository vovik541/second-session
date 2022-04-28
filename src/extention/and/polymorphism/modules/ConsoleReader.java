package extention.and.polymorphism.modules;

import java.util.Scanner;

import static extention.and.polymorphism.modules.ConsoleWriter.print;

public class ConsoleReader {

    public static int readAmountConsole(String variableName) {
        Scanner scanner = new Scanner(System.in);

        print("Please, enter number to generate " + variableName);

        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input <= 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                classes.and.objects.modules.ConsoleWriter.print("Please, input valid positive integer number");
                continue;
            }
            break;
        }
        return input;
    }
}
