package files.modules;

import files.entity.Patient;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PatientsManager {

    public static List<Patient> generatePatients() {
        return new LinkedList<>() {{
            this.add(new Patient("Vova", "2022-04-26", "15:00"));
            this.add(new Patient("Dima", "2022-04-27", "16:30"));
            this.add(new Patient("Alex", "2022-04-28", "17:30"));
            this.add(new Patient("Camilo", "2022-04-20", "11:15"));
            this.add(new Patient("Fred", "2022-04-10", "18:45"));
            this.add(new Patient("Oleg", "2022-03-26", "09:20"));
            this.add(new Patient("Olga", "2022-04-11", "08:45"));
            this.add(new Patient("Nata", "2022-04-26", "10:00"));
            this.add(new Patient("Wendy", "2022-04-26", "07:45"));
            this.add(new Patient("Frank", "1999-02-02", "09:40"));
            this.add(new Patient("Carl", "1999-02-02", "22:40"));
//            this.add("Vova,2022-04-26,10:00");
//            this.add("Dima,2022-04-27,14:45");
//            this.add("Alex,2022-04-28,14:30");
//            this.add("Camilo,2022-04-28,14:45");
//            this.add("Fred,2022-04-29,16:30");
//            this.add("Frank,1985-04-10,18:45");
//            this.add("Oleg,2022-04-11,10:45");
//            this.add("Olga,2022-04-12,14:45");
//            this.add("Nata,2022-04-13,11:15");
//            this.add("Wendy,2022-04-12,15:45");
        }};
    }

    public static List<Patient> deleteOverduePathients(List<Patient> patients) {
        return patients.stream()
                .filter(x -> LocalTime.parse(x.getNextVisitTime()).isAfter(LocalTime.now()))
                .collect(Collectors.toList());
    }

    public static List<Patient> getSecondaryPatients(List<Patient> patients) {
        return patients.stream()
                .filter(x -> LocalDate.parse(x.getLastVisitDate()).isAfter(LocalDate.now().minusDays(10)))
                .collect(Collectors.toList());
    }

    public static List<Patient> getOtherPatients(List<Patient> patients, List<Patient> secondaryPatients) {
        List<Patient> allPatients = new LinkedList<>(patients);
        allPatients.removeAll(secondaryPatients);
        return allPatients;
    }
}
