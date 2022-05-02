def sort_lines(lines):
    return lines.sort(key=len)


def modify_each_line(list):
    for i in range(len(list)):
        list[i] = list[i].replace("\n", "- ") + str(len(list[i])) + "\n"