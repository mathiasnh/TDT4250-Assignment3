# TDT4250 Assignment 3
The task for this assignment is to implement a transformation from (an instance of) the model from assignment 1 to a web page corresponding to the study program pages.

## How to run
* Right click the `uni2TextGenerator.mtl file` in the [acceleo](no.tdt4250.ov3.studyprogram.html.acceleo) folder.
* Choose Run as and Launch Acceleo Application. In Run Configuration editor, choose the mtl file, pick `/no.tdt4250.ov1.studyprogram/model/University1.xmi` as model, and `no.tdt4250.ov3.studyprogram.html` as output folder. 
* When the process is done, view the html document in the target folder.

## Changes made to the Assignment 1 model
The original idea was for each semester to contain 4 slots (SemesterCourse) that would be filled by either an elective or obligatory course (Course) from a department. An obligatory slot would only have one course, while an elective would have many to choose from. But this is more in tune with how a student would pick courses on Studentweb, which is not the target of this model.

To adhere to the style of the actual “Studiets oppbygning” site, I decided to drop the slots and just let each SemesterCourse relate to a course. So now each semester can have 4 or more SemesterCourses.

Specialisation turned out to be a sort of mini study plan, so I decided to remove the Specialisation class altogether and use StudyPlan to define each main profile.

Added code attribute to Course class