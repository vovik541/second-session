import files.entity.patient as patient
from datetime import date
import time


def generate_patients():
    patients = []

    patients.append(patient.Patient("Petrov", "2022-04-11", "12:20"))
    patients.append(patient.Patient("Oleg", "2022-04-12", "20:20"))
    patients.append(patient.Patient("Galager", "2022-04-20", "17:45"))
    patients.append(patient.Patient("Uzumaki", "2022-04-28", "12:20"))
    patients.append(patient.Patient("Horba", "2022-04-29", "12:20"))
    patients.append(patient.Patient("Khymych", "2022-04-29", "12:20"))
    patients.append(patient.Patient("Hamchik", "2022-04-29", "12:20"))
    patients.append(patient.Patient("Lazarev", "2022-04-29", "12:20"))
    patients.append(patient.Patient("Vitovskiy", "2022-04-29", "12:20"))

    return patients


def delete_overdue_patients(patients):
    return [patient for patient in patients if not is_patient_late(patient)]


def is_patient_late(patient):
    current = time.localtime()
    return (current.tm_hour < patient.ordered_time.tm_hour or (
            current.tm_hour == patient.ordered_time.tm_hour and current.tm_min < patient.ordered_time.tm_min))


def get_secondary_patients(patients):
    return [patient for patient in patients if (date.today() - patient.last_visit_date).days < 10]


def get_others_patients(patients):
    return [patient for patient in patients if (date.today() - patient.last_visit_date).days > 10]
