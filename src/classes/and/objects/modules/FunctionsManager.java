package classes.and.objects.modules;

import classes.and.objects.entity.Function;

import java.util.ArrayList;
import java.util.List;

public class FunctionsManager {

    public static Function[] createFunctionsArray() {
        return new Function[]{
                new Function(1, 1, 0),
                new Function(2, -1, 1),
                new Function(3, 1, 1),
                new Function(4, 2, 1),
                new Function(5, 1, -12),
                new Function(6, 7, 1),
                new Function(-7, 2, 7),
                new Function(12, 12, -24),
                new Function(-6, 6, -18),
                new Function(11, 1, 1),
                new Function(-1, -3, 1),
        };
    }

    public static List<Integer> getSuitableFunctionsIndexes(int x, int y, Function[] functions) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < functions.length; i++) {
            if (functions[i].isPartOfFunction(x, y)) {
                indexes.add(i);
            }
        }

        return indexes;
    }
}
