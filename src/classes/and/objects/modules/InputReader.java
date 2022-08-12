package classes.and.objects.modules;

import java.util.Scanner;

import static classes.and.objects.modules.ConsoleWriter.print;

public class InputReader {

    public int readNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        print(message);

        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                print("Please, input valid integer number");
                continue;
            }
            break;
        }
        return input;
    }
}
