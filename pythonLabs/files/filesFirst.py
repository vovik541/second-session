import modules.filemanager as file_manager
import modules.consolemanager as console
import modules.textmanager as t_manager


def run():
    input_file_path = file_manager.get_file_path("firstLabInput.txt")
    print("Input file path is {}\n".format(input_file_path))
    lines = file_manager.read_text_file(input_file_path)
    console.write_to_console(lines, "read from file:")

    t_manager.sort_lines(lines)
    print("Sorted lines")

    output_file_path = file_manager.get_file_path("firstLabOutput.txt")
    print("Output file path is {}\n".format(output_file_path))
    file_manager.write_text_file(output_file_path, lines)
    console.write_to_console(lines, "created new file:")

    lines = file_manager.read_text_file(output_file_path)
    t_manager.modify_each_line(lines)
    file_manager.write_text_file(output_file_path, lines)
    console.write_to_console(lines, "Modified lines and rewritten file:")

    exit()


run()