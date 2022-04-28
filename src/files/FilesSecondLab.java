package files;

import files.entity.Patient;

import java.util.List;

import static files.modules.ConsoleWriter.print;
import static files.modules.ConsoleWriter.printPatients;
import static files.modules.CustomFileReader.readPatientsFromFile;
import static files.modules.CustomFileWriter.createBinaryFile;
import static files.modules.FilePathManager.getFilePath;
import static files.modules.PatientsManager.*;

public class FilesSecondLab {

    public static void main(String[] args) {
        String patientInputFilePath = getFilePath("patientsGenSecLab.txt");
        List<Patient> patients = generatePatients();

        createBinaryFile(patients, patientInputFilePath);
        print("File with patients created:", patientInputFilePath);
        printPatients(patients);

        patients = readPatientsFromFile(patientInputFilePath);
        print("Read from patientsGenSecLab.txt file:");
        printPatients(patients);

        patients = deleteOverduePathients(patients);
        print("All overdue patients were deleted:");
        printPatients(patients);

        createBinaryFile(patients, patientInputFilePath);
        print("File was recreated:", patientInputFilePath);

        String secondaryPatientsFilePath = getFilePath("secondaryPatients.txt");
        List<Patient> secondaryPatients = getSecondaryPatients(patients);
        print("All secondary patients:");
        printPatients(patients);

        createBinaryFile(secondaryPatients, secondaryPatientsFilePath);
        print("File with secondary patients created:", patientInputFilePath);

        String otherPatientsFilePath = getFilePath("secondaryPatients.txt");
        List<Patient> otherPatients = getOtherPatients(patients, secondaryPatients);
        print("All other patients:");
        printPatients(otherPatients);

        createBinaryFile(otherPatients, otherPatientsFilePath);
        print("File with other patients created:", otherPatientsFilePath);
    }
}
