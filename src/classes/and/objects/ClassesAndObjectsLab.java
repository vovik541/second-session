package classes.and.objects;

import classes.and.objects.entity.Function;
import classes.and.objects.modules.InputReader;

import java.util.List;

import static classes.and.objects.modules.ConsoleWriter.print;
import static classes.and.objects.modules.FunctionsManager.createFunctionsArray;
import static classes.and.objects.modules.FunctionsManager.getSuitableFunctionsIndexes;

public class ClassesAndObjectsLab {

    private static final InputReader readNumber = new InputReader();
    public static void main(String[] args) {

        Function[] functionsArray = createFunctionsArray();
        print("Functions initialised");
        print(functionsArray);

        //(1, -1)
        //(3, 7)
        int x = readNumber.readNumber("Input X:");
        int y = readNumber.readNumber("Input Y:");

        List<Integer> indexes = getSuitableFunctionsIndexes(x, y, functionsArray);
        print("Result: ");
        print(indexes, functionsArray);
    }
}
