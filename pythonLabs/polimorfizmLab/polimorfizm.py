import modules.numbermanager as n_manager
import modules.consolemanager as console


def run():
    int_numbers_amount = console.get_num_amount("input int numbers amount:")
    real_numbers_amount = console.get_num_amount("input real numbers amount:")

    numbers = n_manager.generate_int_numbers(int_numbers_amount)
    numbers += n_manager.generate_real_numbers(real_numbers_amount)
    console.write_to_console("Generated objects:")
    console.print_numbers(numbers)

    int_sum = n_manager.find_sum_of_first_digits_for_int_nums(numbers)
    real_sum = n_manager.find_sum_of_last_digits_for_real_nums(numbers)

    console.write_to_console("Sum of first int digits: " + str(int_sum))
    console.write_to_console("Sum of last real digits: " + str(real_sum))


run()
