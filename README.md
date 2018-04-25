# python-Scores-ranking
Project : The School of Computer Science at the University of Bexhill

# Project 1: Computer Science Prize Ranking 
Submission deadline: 11:59pm, Friday 27 April 2018.   
Value: 15% of CITS1401.   
To be done individually.  


You should construct a Python 3 program containing your solution to the following problem and submit your program electronically using cssubmit. No other method of submission is allowed.


You are expected to have read and understood the University's guidelines on academic conduct. In accordance with this policy, you may discuss with other students the general principles required to understand this project, but the work you submit must be the result of your own effort. Plagiarism detection, and other sytems for detecting potential malpractice, will therefore be used. Besides, if what you submit is not your own work then you will have learnt little and will therefore, likely, fail the final exam.


You must submit your project before the submission deadline listed above. Following UWA policy, a late penalty of 10% will be deducted for each day (or part day), after the deadline, that the assignment is submitted. However, in order to facilitate marking of the assignments in a timely manner, no submissions will be allowed after 5 days following the deadline.

------

## Overview 
The School of Computer Science at the University of Bexhill on Sea has a prize for the student who has the best average mark across all the computer science units that he/she took across 3 years. The School has two major sequences of units, and students will undertake a selection of the units on offer. In other words, students may have taken different numbers of units at the time the ranldng is computed.


Each unit can have a different maximum mark (less than, or equal to, 100). Clearly, a student who has taken a unit with a higher maximum mark will have an advantage over a student who has taken a unit with a lower maximum mark, so the ranking method needs combine marks fairly.


What is proposed here is that there will be two files. In each, the fields are separated by commas (CSV format). The first file is a file of A longer student marks file can be found at DB.csv.


Once your program reads in the two files, the program will then use the maximum marks from the units file to normalise the marks achieved in the corresponding units, by dividing each mark by the maximum mark for that subject. That is, the integer marks will be normalised to percentage-marks in the range 0 .. 1.0. You can assume that the order of the columns in the students' marks file (after the student name) is the same as the order of the rows in the units file. That is, column 2 corresponds to CITS1001, column 3 to CITS1401, and so on. Thus, in the example above, the 57 achieved by Neddie Seagoon for CITS1001 is divided by 95, while the mark of 98 achieved by Eccles for CITS1401 will be divided by 100. The empty slots are converted to the Python value None.


In the next stage, the average of the percentage-marks acheived by each student is computed (ignorning None values), and in the final stage, the list of students is printed in descending order of average percentage-mark. Please print the percentage-marks values to 3 decimal places. The output for the units file and students file linked above can be found at output.txt.


## Tasks 
You are required to write the following Python functions. Make sure you understand where each function fits into the system described above.

1. def open_file(filename):  
  Test whether the file assigned to variable filename is actually present. You will need to include the module os to do that, and use     the the function os . path. is f ile (). If the file is present, open it and return the file handle; if not a message should be         printed, and the value None returned. 
  
2. def get_units(unitfile): 
  Given the file handle for the opened units CSV file, this function returns a list of two item lists (or tuples), where the first item   in each pair is the code for the unit, and the other is a floating point number representing the maximum mark achieved in that unit.     For example, in the simple case described above, the function would return: [ (nCITS1001n, 95) , (nCITS14〇ln, 1〇〇），                 (nCITS1402n,93)] 

3. def get_student_records(students_file, unit_count): 
  Given the file handle for the opened student marks CSV file, this function returns a list containing a list (or tuple) for each         student. The first item is the name of the student, with the remaining items being floating point numbers or None. The second argument   to the function, unit_count is used to check that the number of unit marks (or None values) reported for a particular student is the     same as the number of units covered by this analysis. For example, if students_f ile is the file handle for the small example above,     the function should return: [ ("Needie Seagoon" , 57, None, 83) , ("Eccles", None, 98, 91 ), ("Bluebottle”,61,None,88)] • 

4. def normalise(students_list, units_list): 
  Given the list of student records, and the list of units, return a new list of student records in which, for each of a student's         marks, the percentile mark is computed by dividing the actual mark by the maximum mark for the corresponding subject. That is, if       there is a mark in the first marks column, it is divided by the first maximum mark, a mark in the second marks column is divided by     the second maximum mark, and so on. In the small example discussed above, given the student marks list: [ ("Needie Seagoon’’, 57,       None, 83) , (’’Eccles”, None, 98, 91) , (’’Bluebottle’’, 61, None, 88)] and units list [(nCITS1001n, 95) , (nCITS14〇ln, 1〇0) ,         (nCITS14 〇2 n, 93)], this function should return: [[’Needie Seagoon', 0.6, None, 0.8924731182795699], [ 'Eccles', None, 0.98,           0.978494623655914], [ 'Bluebottle', 0.6421052631578947, None, 0.946236559139785]]. 

5. def compute_mean_pc(students_pclist): 
  Given the new list of student records, with percentiles (floating point values less than or equal to 1.0) replacing the actual marks,   this function computes the mean (average) percentile, ignoring the None values. In the small example, the returned list is:             [(0.7462365591397849, 'Needie Seagoon'), (0.979247311827957, 'Eccles'), (0.794170 9111488399, 'Bluebottle ' ) ]. Note that the order     of items in each pair has been reversed. 


5. def compute_mean_pc(students_pclist): 
  Given the new list of student records, with percentiles (floating point values less than or equal to 1.0) replacing the actual marks,   this function computes the mean (average) percentile, ignoring the None values. In the small example, the returned list is:             [(0.7462365591397849, 'Needie Seagoon'), (0.979247311827957, 'Eccles'), (0.794170 9111488399, 'Bluebottle ' ) ]. Note that the order     of items in each pair has been reversed. 

6. def print_final_list(mean_pclist): 
  Given the list of mean percentile value, student name pairs, print the list to standard output (screen by default), one per line, with   the name appearing first. In other words, you should see: Eccles 0.979 Bluebottle 0.794 Needie Seagoon 0.746


7. def main (): 
  main () pulls together all the other functions to implement the solution to this problem, main () prompts the user for the name of the   unit and maximum marks file, and the name of the student marks file, and then computes and prints out the ranked list, as described     above. While all the functions are important, it is particularly important that you define main () because your program will be         tested via calls to main (), so if you fail to implement main (), it will be impossible to test your program.


## Assumptions 
Your program can assume a number of things: 

1. Anything is that meant to be a string (i.e. a name) will be a string, and anything that is meant to be a number (i.e. a mark) will be a number. You will be able to not have this assumption later in the unit. 

2. The order of columns in the student records will be the same as the order of rows in the units list.
What is also being said here is that there are number of errors that your program should explicitly test for and respond to. Two were discussed above.

## Submission 
Submit a single Python (. py) file containing all of your functions via cssubmit.
