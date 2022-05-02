from abc import ABC, abstractmethod


class TNumber(ABC):

    def __init__(self, number):
        self.number = number

    @abstractmethod
    def find_digit_sum(self):
        pass

    def find_first_digit(self):
        return int(str(self.number)[0])

    def find_last_digit(self):
        temp_str = str(self.number)
        return int(temp_str[len(temp_str) - 1])


class TIntNumber(TNumber):
    def find_digit_sum(self):
        num = self.number
        sum = 0
        while (num != 0):
            sum = sum + num % 10
            num = num // 10
        return sum


class TRealNumber(TNumber):
    def find_digit_sum(self):
        num = int(str(self.number).replace(".", ""))
        sum = 0
        while (num != 0):
            sum = sum + num % 10
            num = num // 10
        return sum
