package files;

import files.entity.Patient;

import java.util.List;

import static files.modules.ConsoleWriter.print;
import static files.modules.ConsoleWriter.printPatients;
import static files.modules.CustomFileReader.readFromSerialisedPatientsBinaryFile;
import static files.modules.CustomFileWriter.createSerialisedObjectsBinaryFile;
import static files.modules.FilePathManager.getFilePath;
import static files.modules.PatientsManager.*;

public class FilesSecondLab {

    public static void main(String[] args) {
        String patientInputFilePath = getFilePath("patientsGenSecLab.dat");
        List<Patient> patients = generatePatients();

        //create input file
        createSerialisedObjectsBinaryFile(patients, patientInputFilePath);
        print("File with patients created:", patientInputFilePath);
        printPatients(patients);

        //read from input file
        patients = readFromSerialisedPatientsBinaryFile(patientInputFilePath);
        //delete overdue from input file
        patients = deleteOverduePathients(patients);
        print("All overdue patients were deleted:");
        createSerialisedObjectsBinaryFile(patients, patientInputFilePath);
        print("File was recreated:", patientInputFilePath);
        printPatients(patients);

        //create secondary patients file
        String secondaryPatientsFilePath = getFilePath("secondaryPatients.dat");
        List<Patient> secondaryPatients = getSecondaryPatients(patients);
        print("All secondary patients:");
        printPatients(secondaryPatients);
        createSerialisedObjectsBinaryFile(secondaryPatients, secondaryPatientsFilePath);
        print("File with secondary patients created:", patientInputFilePath);

        //create other patients file
        String otherPatientsFilePath = getFilePath("otherPatients.dat");
        List<Patient> otherPatients = getOtherPatients(patients, secondaryPatients);
        print("All other patients:");
        printPatients(otherPatients);

        createSerialisedObjectsBinaryFile(otherPatients, otherPatientsFilePath);
        print("File with other patients created:", otherPatientsFilePath);
    }
}
