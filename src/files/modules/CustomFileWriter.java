package files.modules;

import files.entity.Patient;

import java.io.*;
import java.util.List;

public class CustomFileWriter {
    public static void createFile(List<String> lines, String path) {
        File file = new File(path);

        try (FileWriter writer = new FileWriter(path, false)) {
            file.createNewFile();

            for (String line : lines) {
                writer.write(line);
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void createBinaryFile(List<Patient> patients, String path) {
        try (OutputStream outputStream = new FileOutputStream(path)) {
            int fileSize = 0;
            for (Patient patient : patients) {
                fileSize += patient.toString().getBytes().length;
            }

            byte[] allBytes = new byte[(int) fileSize];

            int bytesRead = 0;
            for (Patient patient : patients) {
                for (byte b : patient.toString().getBytes()) {
                    allBytes[bytesRead] = b;
                    bytesRead++;
                }
            }

            outputStream.write(allBytes, 0, bytesRead);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
