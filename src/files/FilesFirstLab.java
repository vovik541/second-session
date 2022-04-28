package files;

import java.io.*;
import java.util.*;

import static files.modules.ConsoleWriter.print;
import static files.modules.CustomFileReader.readLines;
import static files.modules.CustomFileWriter.createFile;
import static files.modules.FilePathManager.getFilePath;
import static files.modules.LinesManager.addNumbersToTheEndOfLines;
import static files.modules.LinesManager.sortLines;

public class FilesFirstLab {
    public static void main(String[] args) {
        String inputFilePath = getFilePath("inputFileFirstLab.txt");
        print("Input file path is:", inputFilePath);

        List<String> lines = readLines(inputFilePath);
        print("Input file contains lines:");
        print(lines);

        sortLines(lines);
        print("Lines are sorted:");
        print(lines);

        lines = addNumbersToTheEndOfLines(lines);
        print("Added number in the and of all lines:");
        print(lines);

        String outputFilePath = getFilePath("outputFileFirstLab.txt");
        print("Output file path is:", inputFilePath);

        createFile(lines, outputFilePath);
        print("Output file created.");


    }
}