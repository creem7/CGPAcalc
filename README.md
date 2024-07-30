# CGPAcalc

Algorithm
1.	Initialize GUI Components:
  i.	Create text fields for course name, credit units, grade, semester, and goal CGPA.
  ii.	Create text areas for results and goal messages.
  iii. Create buttons for adding courses, calculating CGPA, resetting fields, and setting goal CGPA.
  iv. Create a panel to organize the components.
2.	Set Up Event Listeners:
  i. Add action listeners for the buttons to handle user actions:
  ii. Add Course Listener: Adds the entered course details to maps.
  iii. Calculate Listener: Computes and displays the CGPA.
  iv. Reset Listener: Clears all fields and maps.
  v. Set Goal Listener: Sets and displays the goal CGPA.
3.	Add Course:
  i. Read the input fields for course name, credit units, grade, and semester.
  ii. Convert the grade to a grade point.
  iii. Calculate total grade points for the course.
  iv. Update maps for the respective semester with the new course data.
  v. Display the added course information in the result area.
4.	Calculate CGPA:
  i. Sum the total grade points and total credit units from the maps.
  ii. Compute the CGPA by dividing total grade points by total credit units.
  iii. Determine the class of degree based on CGPA.
  iv. Display the CGPA, class of degree, and a congratulatory message in the result area.
5.	Reset Fields:
  i. Clear all input fields and text areas.
  ii. Reset the maps storing course data.
6.	Set Goal CGPA:
  i. Read the goal CGPA input.
  ii. Validate the input and set the goal CGPA.
  iii. Display the goal CGPA or an error message in the goal area.

