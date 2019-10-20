# TDT4250-Assignments
Assignments for the course TDT4250 - Advanced Software Design

## Project structure 
One should be able to clone the project and get it up and running right away. The folder labelled `Training` is just examples from the EMF tutorial and from lectures. 

The `.ecore` and `.genmodel` files, as well as en example-instance `University.xmi`, are located in the `model` folder.

There are constraints written both manually and with OCL. The manually written contraints can be found under `src/studyprogram/util/StudyprogramValidator.java`

## Changes made for Assignment 3
The original idea was for each semester to contain 4 slots (SemesterCourse) that would be filled by either an elective or obligatory course (Course) from a department. An obligatory slot would only have one course, while an elective would have many to choose from. But this is more in tune with how a student would pick courses on Studentweb, which is not the target of this model.

To adhere to the style of the actual “Studiets oppbygning” site, I decided to drop the slots and just let each SemesterCourse relate to a course. So now each semester can have 4 or more SemesterCourses.

Specialisation turned out to be a sort of mini study plan, so I decided to remove the Specialisation class altogether and use StudyPlan to define each main profile.

Added code attribute to Course class