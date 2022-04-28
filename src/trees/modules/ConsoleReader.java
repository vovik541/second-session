package trees.modules;

import java.util.Scanner;

public class ConsoleReader {

    public static int readDeepFromConsole() {
        Scanner scanner = new Scanner(System.in);

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
