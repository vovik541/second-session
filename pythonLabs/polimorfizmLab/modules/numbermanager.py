import random
import polimorfizmLab.entity.tnumbers as t_num


def generate_int_numbers(amount):
    numbers = []
    for i in range(0, amount):
        numbers.append(t_num.TIntNumber(random.randint(1, 10000)))
    return numbers


def generate_real_numbers(amount):
    numbers = []
    for i in range(0, amount):
        numbers.append(t_num.TRealNumber(str("{0:.3f}".format(random.uniform(1, 100)))))
    return numbers


def find_sum_of_first_digits_for_int_nums(numbers):
    sum = 0
    for number in numbers:
        if isinstance(number, t_num.TIntNumber):
            sum += number.find_first_digit()
    return sum


def find_sum_of_last_digits_for_real_nums(numbers):
    sum = 0
    for number in numbers:
        if isinstance(number, t_num.TRealNumber):
            sum += number.find_last_digit()
    return sum
