package files.modules;

import files.entity.Patient;

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
        System.out.printf("%s\n\n", message);
    }

    public static void printPatients(List<Patient> patients) {
        patients.forEach(x -> System.out.printf(String.format("%8s %12s %7s \n", x.getName(), x.getLastVisitDate(), x.getNextVisitTime())));
        System.out.println();
    }
}
