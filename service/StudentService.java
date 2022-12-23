package service;

import model.Student;
import model.Teacher;

public class StudentService {
    Student[] studentList=new Student[200];
    int index=0;
    public boolean addStudent(String studentUserName, String studentPassword, String studentFullName, String studentCourseName, String studentCourseNumber, String studentGroupNumber){
        for (Student student : studentList) {
            if(student!=null){
                if(student.getStudentUserName().equals(studentUserName)){
                    return false;
                }
            }
        }
        studentList[index++]=new Student(studentUserName,studentPassword,studentFullName,studentCourseName,studentCourseNumber,studentGroupNumber);
        return true;
    }
    public Student login(String username,String password){
        for (Student student : studentList) {
            if(student!=null){
                if(student.getStudentUserName().equals(username) && student.getStudentPassword().equals(password)){
                    return student;
                }
            }
        }
        return null;
    }
    public void getStudent(String username,String password){
        Student currentStudent=login(username,password);
        for (Student student : studentList) {
            if (student != null) {
                if (student.getStudentId().equals(currentStudent.getStudentId())) {
                        System.out.println("O'quvchining ism-sharifi: " + student.getStudentFullName());
                        System.out.println("O'quvchining o'qiyotgan mutaxasisligi: " + student.getStudentCourseName());
                        System.out.println("O'quvchining o'qiyotgan guruhi: " + student.getStudentGroupNumber());
                        System.out.println("O'quvchining o'qiyotgan kursi: " + student.getStudentCourseNumber());
                        System.out.println("O'quvchining davomati: " + student.getAttendance());
                }
            }
        }
    }
    public void getStudentList(){
        int cnt=0;
        for (Student student: studentList) {
            if(student!=null){
                System.out.println("\t<<"+ ++cnt +">>\t");
                System.out.println("O'quvchining ism-sharifi: "+student.getStudentFullName());
                System.out.println("O'quvchining o'qiyotgan mutaxasisligi: "+student.getStudentCourseName());
                System.out.println("O'quvchining o'qiyotgan guruhi: "+student.getStudentGroupNumber());
                System.out.println("O'quvchining o'qiyotgan kursi: "+student.getStudentCourseNumber());
                System.out.println("O'quvchining davomati: "+student.getAttendance());
            }
        }
    }
}
