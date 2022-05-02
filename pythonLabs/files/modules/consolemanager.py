def write_to_console(lines, message):
    print(message + "\n")
    for line in lines:
        print(line.replace("\n", ""))
    print()


def display_patients(patients, message):
    print('\n' + message + '\n')
    for patient in patients:
        print("Surname= {}, LastVisit {}-{}-{}, BookedTime= {}:{}"
              .format(patient.surname,
                      patient.last_visit_date.year,
                      patient.last_visit_date.month,
                      patient.last_visit_date.day,
                      patient.ordered_time.tm_hour,
                      patient.ordered_time.tm_min))
