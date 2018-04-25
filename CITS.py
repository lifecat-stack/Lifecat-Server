import copy
import csv
import os


def open_file(filename):
    """
    open DB.csv
    :param filename:
    :return: handle
    """
    if os.path.isfile(filename):
        file = open(filename)
        return file
    else:
        print("it is not file")
        return None


def get_units(unitfile):
    """
    open units.csv
    :param unitfile:
    :return: rows in units.csv
    """
    if os.path.isfile(unitfile):
        file = open(unitfile)
        reader = csv.reader(file)
        rows = [row for row in reader]
        # print(rows)
        return rows
    else:
        print("it is not file")
        return None


def get_student_records(students_file, unit_count):
    """
    get records
    :param students_file:
    :param unit_count:
    :return: rows in DB.csv
    """
    reader = csv.reader(students_file)
    rows = [row for row in reader]
    for row in rows:
        for i in range(unit_count + 1):
            if row[i] == '':
                row[i] = "None"
    # print(rows)
    return rows


def normalise(students_list, units_list):
    """

    :param students_list:
    :param units_list:
    :return:
    """
    stu_count = len(students_list)  # len student
    unit_count = len(units_list)  # len unit

    scores = copy.copy(students_list)

    for i in range(stu_count):
        for j in range(unit_count):
            if students_list[i][j + 1] != 'None':
                score = int(students_list[i][j + 1]) / int(units_list[j][1])
                # print(students_list[i][j + 1],'   ',units_list[j][1])
                scores[i][j + 1] = score
            else:
                continue

    # for row in scores:
        # print(row)
    return scores


def compute_mean_pc(students_pclist):
    """

    :param students_pclist:
    :return:
    """
    means = [[0, 0] for i in range(len(students_pclist))]
    for k in range(len(students_pclist)):
        sum = count = 0
        # print("row", students_pclist[k])
        for i in range(len(students_pclist[k])):
            if students_pclist[k][i] == 'None':
                continue
            elif i == 0:
                continue
            else:
                count += 1
                sum += (students_pclist[k][i])
        mean = sum / count
        means[k][0] = mean
        means[k][1] = students_pclist[k][0]
        # print(means[k])

    return means


def print_final_list(mean_pclist):
    """
    print final
    :param mean_pclist:
    :return:
    """
    rank = []
    for stu in mean_pclist:
        rank.append(stu)

    rank.sort()

    count=1
    for i in range(len(rank))[::-1]:
        print("number",count,"is",rank[i])
        count+=1


def main():
    """

    :return:
    """
    file = open_file("DB.csv")
    units_rows = get_units("units.csv")
    unit_count = len(units_rows)
    stu_records = get_student_records(file, unit_count)
    scores = normalise(stu_records, units_rows)
    means = compute_mean_pc(scores)
    print_final_list(means)


if __name__ == '__main__':
    main()
