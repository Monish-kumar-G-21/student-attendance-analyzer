package com.attendance;
public class App {
public static double calculateAttendancePercentage(int attended, int total) {
if (total == 0) return 0;
return ((double) attended / total) * 100;
}
public static boolean isEligibleForExam(double percentage) {
return percentage >= 75;
}
public static String getWarningStatus(double percentage) {
if (percentage >= 75) return "No Warning - Eligible for Exam";
else if (percentage >= 60) return "Warning - Attendance Low";
else return "Detained - Attendance Critical";
}
public static void main(String[] args) {
int attended = 38;
int total = 60;
double percentage = calculateAttendancePercentage(attended, total);
System.out.println("Attendance Percentage: " + percentage + "%");
System.out.println("Eligible for Exam: " + isEligibleForExam(percentage));
System.out.println("Status: " + getWarningStatus(percentage));
}
}
