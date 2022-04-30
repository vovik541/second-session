package algorithms.second;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IPz11_Hymych_2 {

    public static void main(String[] args) {
        String inputFilePath = readInputFileFullPath();
        int x = readCustomer();
        Map<Integer, ArrayList<Integer>> input = readFromFile(inputFilePath);
        HashMap<Integer, Integer> preferences = arrToMap(input.get(x));
        HashMap<Integer, Integer> result = lookForInversions(x, input, preferences);
        LinkedHashMap<Integer, Integer> sorted = sortByValue(result.entrySet());
        createFile(sorted, x);
    }

    private static LinkedHashMap<Integer, Integer> sortByValue(Set<Map.Entry<Integer, Integer>> entries) {
        return entries.stream()
                .sorted(Entry.comparingByValue())
                .collect(Collectors.toMap(Entry::getKey,
                        Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    private static void createFile(LinkedHashMap<Integer, Integer> result, int x) {
        File file = new File("IPz11_hymych_02_output.txt");

        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(String.format("%d\n", x));
            for (Entry<Integer, Integer> entry : result.entrySet()) {
                writer.write(String.format("%d %d\n", entry.getKey(), entry.getValue()));
            }

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static HashMap<Integer, Integer> lookForInversions(int x, Map<Integer, ArrayList<Integer>> input, HashMap<Integer, Integer> preferences) {
        return new HashMap<>() {{
            for (Map.Entry<Integer, ArrayList<Integer>> entry : input.entrySet()) {
                if (entry.getKey() != x) {
                    this.put(entry.getKey(), findInversion(entry.getValue(), preferences, 0));
                }
            }
        }};
    }

    private static int findInversion(ArrayList<Integer> toCompare, HashMap<Integer, Integer> preferences, int deep) {
        if (deep == toCompare.size() - 1) {
            return 0;
        }
        int numOfInversions = 0;
        for (int i = deep; i < toCompare.size() - 1; i++) {
            if (preferences.get(toCompare.get(deep)) > preferences.get(toCompare.get(i + 1))) {
                numOfInversions++;
            }
        }
        return numOfInversions + findInversion(toCompare, preferences, deep + 1);
    }

    private static HashMap<Integer, Integer> arrToMap(ArrayList<Integer> prefsArr) {
        return new HashMap<>() {{
            for (int i = 0; i < prefsArr.size(); i++) {
                this.put(prefsArr.get(i), i);
            }
        }};
    }

    private static int readCustomer() {
        System.out.printf("Please, input customer number to compare with: \nX= ");
        return new Scanner(System.in).nextInt();
    }

    private static String readInputFileFullPath() {
        System.out.printf("Please, provide input file full path: \nPath= ");
        return new Scanner(System.in).nextLine();
    }

    private static Map<Integer, ArrayList<Integer>> readFromFile(String path) {
        Map<Integer, ArrayList<Integer>> input = new HashMap<>();
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            //Amount of customers and films are not necessary, so I don't save them from file.
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                int[] row = Stream.of(line.trim().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                input.put(row[0], new ArrayList<>() {{
                    for (int i = 1; i < row.length; i++) {
                        this.add(row[i]);
                    }
                }});
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return input;
    }
}
