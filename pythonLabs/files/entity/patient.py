from datetime import date
import time

class Patient:
    def __init__(self, surname, last_visit_date, ordered_time):
        self.surname = surname
        year_month_date = last_visit_date.split("-")
        self.last_visit_date = date(int(year_month_date[0]), int(year_month_date[1]),
                                                     int(year_month_date[2]))
        self.ordered_time = time.strptime(ordered_time, "%H:%M")
