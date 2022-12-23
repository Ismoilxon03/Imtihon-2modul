package model;

import java.util.UUID;

public class Student {
    private String studentUserName;
    private String studentPassword;
    private String studentFullName;
    private String studentCourseName;
    private String studentCourseNumber;
    private String studentGroupNumber;
    private int attendance;
    private UUID studentId;

    public Student() {
        this.studentId=UUID.randomUUID();
    }

    public UUID getStudentId() {
        return studentId;
    }

    public Student(String studentUserName, String studentPassword, String studentFullName, String studentCourseName, String studentCourseNumber, String studentGroupNumber) {
        this.studentUserName = studentUserName;
        this.studentPassword = studentPassword;
        this.studentFullName = studentFullName;
        this.studentCourseName = studentCourseName;
        this.studentCourseNumber = studentCourseNumber;
        this.studentGroupNumber = studentGroupNumber;
    }

    public String getStudentUserName() {
        return studentUserName;
    }

    public void setStudentUserName(String studentUserName) {
        this.studentUserName = studentUserName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public String getStudentCourseName() {
        return studentCourseName;
    }

    public void setStudentCourseName(String studentCourseName) {
        this.studentCourseName = studentCourseName;
    }

    public String getStudentCourseNumber() {
        return studentCourseNumber;
    }

    public void setStudentCourseNumber(String studentCourseNumber) {
        this.studentCourseNumber = studentCourseNumber;
    }

    public String getStudentGroupNumber() {
        return studentGroupNumber;
    }

    public void setStudentGroupNumber(String studentGroupNumber) {
        this.studentGroupNumber = studentGroupNumber;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentUserName='" + studentUserName + '\'' +
                ", studentPassword='" + studentPassword + '\'' +
                ", studentFullName='" + studentFullName + '\'' +
                ", studentCourseName='" + studentCourseName + '\'' +
                ", studentCourseNumber='" + studentCourseNumber + '\'' +
                ", studentGroupNumber='" + studentGroupNumber + '\'' +
                ", attendance=" + attendance +
                ", studentId=" + studentId +
                '}';
    }
}
