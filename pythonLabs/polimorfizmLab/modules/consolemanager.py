import polimorfizmLab.entity.tnumbers as t_num


def write_to_console(message):
    print("\n" + message + "\n")


def get_num_amount(message):
    return int(input(message))


def print_numbers(numbers):
    for number in numbers:
        if isinstance(number, t_num.TIntNumber):
            print("TIntNumber= " + str(number.number))
        if isinstance(number, t_num.TRealNumber):
            print("TRealNumber= " + str(number.number))
