import pickle


def get_file_path(file_name):
    return "D:\\projects\\pythonLabs\\files\\resources\\" + file_name


def read_text_file(file_path):
    file = open(file_path, "rt")
    lines = []

    for line in file:
        lines.append(line)

    file.close()
    return lines


def write_text_file(file_path, lines):
    file = open(file_path, "wt")

    for line in lines:
        file.write(line)

    file.close()


def write_patients_to_file(file_name, patients):
    with open(file_name, 'wb') as file:
        pickle.dump(patients, file)


def read_patients_from_file(file_name):
    with open(file_name, 'rb') as file:
        return pickle.load(file)
