package com.attendance;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest {
@Test
public void testAttendancePercentage() {
assertEquals(75.0, App.calculateAttendancePercentage(45, 60), 0.01);
}
@Test
public void testEligibility() {
assertTrue(App.isEligibleForExam(75.0));
assertFalse(App.isEligibleForExam(74.9));
}
@Test
public void testWarningStatus() {
assertEquals("No Warning - Eligible for Exam", App.getWarningStatus(80));
assertEquals("Warning - Attendance Low", App.getWarningStatus(65));
assertEquals("Detained - Attendance Critical", App.getWarningStatus(50));
}
}
