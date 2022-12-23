package service;

import model.Student;
import model.Teacher;

public class TeacherService {
    Teacher[] teacherList=new Teacher[100];
    int index=0;

    public boolean addTeacher(String teacherUserName, String teacherPassword, String teacherFullName, String courseName, String teacherLevel){
        for (Teacher teacher : teacherList) {
            if(teacher!=null){
                if(teacher.getTeacherUserName().equals(teacherUserName)){
                    return false;
                }
            }
        }
        teacherList[index++]=new Teacher(teacherUserName,teacherPassword,teacherFullName,courseName,teacherLevel);
        return true;
    }
    public Teacher login(String username,String password){
        for (Teacher teacher: teacherList) {
            if(teacher!=null){
                if(teacher.getTeacherUserName().equals(username) && teacher.getTeacherPassword().equals(password)){
                    return teacher;
                }
            }
        }
        return null;
    }
    public void getTeacher(String username,String password){
        Teacher currentTeacher=login(username,password);
        for (Teacher teacher: teacherList) {
            if(teacher!=null){
                System.out.println("O'qituvchining ism-sharifi: "+teacher.getTeacherFullName());
                System.out.println("O'qituvchining mutaxasisligi: "+teacher.getCourseName());
                System.out.println("O'qituvchining darajasi: "+teacher.getTeacherLevel());
            }
        }
    }
    public void getTeacherList(){
        int cnt=0;
        for (Teacher teacher: teacherList) {
            if(teacher!=null){
                System.out.println("\t<<"+ ++cnt +">>\t");
                System.out.println("O'qituvchining ism-sharifi: "+teacher.getTeacherFullName());
                System.out.println("O'qituvchining mutaxasisligi: "+teacher.getCourseName());
                System.out.println("O'qituvchining darajasi: "+teacher.getTeacherLevel());
            }
        }
    }
}
