package files.modules;

import files.entity.Patient;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CustomFileReader {
    public static List<String> readLines(String path) {
        List<String> lines = new LinkedList<>();
        try (FileReader fileReader = new FileReader(path);

             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            lines.add(bufferedReader.readLine());
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public static List<Patient> readPatientsFromFile(String path) {
        List<Patient> patients = new LinkedList<>();
        File file = new File(path);

        try (InputStream inputStream = new FileInputStream(file)) {
            char c;
            String s = "";
            String[] fields;

            for (int i = 0; i < file.length(); i++) {
                c = (char) inputStream.read();
                if (c == '\n') {
                    fields = s.split(",");
                    patients.add(new Patient(fields[0], fields[1], fields[2]));
                    s = "";
                    continue;
                }
                s += c + "";
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return patients;
    }
    public static List<Patient> readFromSerialisedPatientsBinaryFile(String path) {
        List<Patient> patients = new LinkedList<>();
        try (FileInputStream fileInputStream = new FileInputStream((path));
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            while (true){
                patients.add((Patient) objectInputStream.readObject());
            }
        } catch (EOFException e){
            //end of file reached
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return patients;
    }
}
