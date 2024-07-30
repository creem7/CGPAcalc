private int getGradePoint(String grade) {
   switch (grade) {
   case "A": return 5;
   case "B": return 4;
   case "C": return 3;
   case "D": return 2;
   case "E": return 1;
   case "F": return 0;
   default: return -1;
 }
}
private String getClassOfDegree(double cgpa) {
  if (cgpa >= 4.50) return "First Class";
  else if (cgpa >= 3.50) return "Second Class (Upper)";
  else if (cgpa >= 2.40) return "Second Class (Lower)";
  else if (cgpa >= 1.50) return "Third Class";
  else return "Fail (Certificate of Attendance)";
}
private String getCongratulatoryMessage(double cgpa) {
  if (cgpa >= 4.50) return "Excellent work! Keep it up!";
  else if (cgpa >= 3.50) return "Great job! You're doing really
well!";
  else if (cgpa >= 2.40) return "Good effort! Keep striving for
improvement!";
  else if (cgpa >= 1.50) return "Fair effort! Keep working hard!";
  else return "Don't give up! Keep trying and you'll improve!";
}