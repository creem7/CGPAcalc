private class AddCourseListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
     try {
       String courseName = courseNameField.getText();
       int creditUnits =
Integer.parseInt(creditUnitField.getText());
       String grade = gradeField.getText().toUpperCase();
       int semester = Integer.parseInt(semesterField.getText());

       int gradePoint = getGradePoint(grade);
       if (gradePoint == -1) {
          resultArea.append("Invalid grade entered for " +
courseName + "\n");
} else {
   totalCreditUnitsMap.put(semester,
totalCreditUnitsMap.getOrDefault(semester, 0) + creditUnits);
   totalGradePointsMap.put(semester,
totalGradePointsMap.getOrDefault(semester, 0) + creditUnits *
gradePoint);
   resultArea.append("Added " + courseName + " for
semester " + semester + " with " + creditUnits + " credit units and
grade " + grade + "\n");
        }
      } catch (NumberFormatException ex) {
        resultArea.append("Please enter valid numbers for credit
units and semester.\n");
      }
    }
} 