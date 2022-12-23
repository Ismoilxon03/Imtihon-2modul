package model;

import java.util.UUID;

public class Teacher {
    private String teacherUserName;
    private String teacherPassword;
    private String teacherFullName;
    private String courseName;
    private String teacherLevel;
    private double teacherSalary;
    private UUID teacherId;
    private double oliy=0.6;
    private double urta=0.4;
    private double quyi=0.3;
    public Teacher() {
        this.teacherId=UUID.randomUUID();
    }
    public Teacher(String teacherUserName, String teacherPassword, String teacherFullName, String courseName, String teacherLevel) {
        this.teacherUserName = teacherUserName;
        this.teacherPassword = teacherPassword;
        this.teacherFullName = teacherFullName;
        this.courseName = courseName;
        this.teacherLevel = teacherLevel;
    }
    public UUID getTeacherId() {
        return teacherId;
    }

    public String getTeacherUserName() {
        return teacherUserName;
    }

    public void setTeacherUserName(String teacherUserName) {
        this.teacherUserName = teacherUserName;
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }

    public String getTeacherFullName() {
        return teacherFullName;
    }

    public void setTeacherFullName(String teacherFullName) {
        this.teacherFullName = teacherFullName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getTeacherSalary() {
        return teacherSalary;
    }

    public void setTeacherSalary(double teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    public String getTeacherLevel() {
        return teacherLevel;
    }

    public void setTeacherLevel(String teacherLevel) {
        this.teacherLevel = teacherLevel;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherUserName='" + teacherUserName + '\'' +
                ", teacherPassword='" + teacherPassword + '\'' +
                ", teacherFullName='" + teacherFullName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", teacherLevel=" + teacherLevel +
                ", teacherSalary=" + teacherSalary +
                ", teacherId=" + teacherId +
                '}';
    }
}
