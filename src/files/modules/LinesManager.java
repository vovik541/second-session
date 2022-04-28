package files.modules;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LinesManager {
    public static List<String> addNumbersToTheEndOfLines(List<String> lines) {
        return lines.stream().map(x -> x + " - " + x.length()).collect(Collectors.toList());
    }

    public static void sortLines(List<String> lines) {
        lines.sort(Comparator.comparingInt(String::length));
    }
}
