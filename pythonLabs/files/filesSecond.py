import modules.filemanager as file_manager
import modules.patientsmanager as p_manager
import modules.consolemanager as c_manager


def run():
    # Create input file
    input_file_path = file_manager.get_file_path("patientsInput.dat")
    patients = p_manager.generate_patients()
    file_manager.write_patients_to_file(input_file_path, patients)
    c_manager.display_patients(patients, "created input file:")

    # Delete all overdue patients from input file
    patients = p_manager.delete_overdue_patients(patients)
    file_manager.write_patients_to_file(input_file_path, patients)
    c_manager.display_patients(patients, "Overdue patients deleted:")

    # Create secondary patients file from input
    secondary_file_path = file_manager.get_file_path("secondaryPatients.dat")
    secondary_patients = p_manager.get_secondary_patients(patients)
    file_manager.write_patients_to_file(secondary_file_path, secondary_patients)
    c_manager.display_patients(secondary_patients, "File with secondary patients created:")

    # Create others patients file from input
    others_file_path = file_manager.get_file_path("othersPatients.dat")
    others_patients = p_manager.get_others_patients(patients)
    file_manager.write_patients_to_file(others_file_path, others_patients)
    c_manager.display_patients(others_patients, "File with others patients created:")


run()
