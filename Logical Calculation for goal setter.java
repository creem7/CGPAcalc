private class CalculateCgpaListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
    if (totalCreditUnitsMap.isEmpty()) {
       resultArea.append("\nNo courses added yet.\n");
} else {
   double totalGpa = 0.0;
   int numberOfSemesters = totalCreditUnitsMap.size();
   for (int semester : totalCreditUnitsMap.keySet()) {
     int totalCreditUnits =
totalCreditUnitsMap.get(semester);
     int totalGradePoints =
totalGradePointsMap.get(semester);
     double gpa = (double) totalGradePoints /
totalCreditUnits;
          totalGpa += gpa;
          resultArea.append("\nSemester " + semester + " - GPA:
" + String.format("%.2f", gpa));
         }
         double cgpa = totalGpa / numberOfSemesters;
         resultArea.append("\n\nOverall CGPA: " +
String.format("%.2f", cgpa));
         resultArea.append("\nClass of Degree: " +
getClassOfDegree(cgpa) + "\n");

      resultArea.append(getCongratulatoryMessage(cgpa) +
"\n");
     if (goalCgpa > 0) {
        double remainingCgpa = goalCgpa - cgpa;
        if (remainingCgpa > 0) {
           goalArea.append("You need to improve your CGPA
by " + String.format("%.2f", remainingCgpa) + " to reach your
goal.\n");
            } else {
               goalArea.append("Congratulations! You have
reached your CGPA goal.\n");
         }
        }
      }
    }
}
private class ResetListener implements ActionListener {
   @Override
   public void actionPerformed(ActionEvent e) {
    courseNameField.setText("");
    creditUnitField.setText("");
    gradeField.setText("");
    semesterField.setText("");
    resultArea.setText("");
    goalArea.setText("");
    totalCreditUnitsMap.clear();
    totalGradePointsMap.clear();
    goalCgpa = 0;
    }
}