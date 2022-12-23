import model.Teacher;
import service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInt=new Scanner(System.in);
        Scanner scannerStr=new Scanner(System.in);
        AdminService adminService=new AdminService();
        BranchService branchService=new BranchService();
        CourseService courseService=new CourseService();
        StudentService studentService=new StudentService();
        TeacherService teacherService=new TeacherService();
        int stepCode=100;
        while (stepCode!=0){
            System.out.println("1.Add Admin, 2.Add Student, 3.Login, 0.Exit");
            stepCode=scannerInt.nextInt();
            switch (stepCode){
                case 1->{
                    System.out.println("Enter Admin User name: ");
                    String username=scannerStr.nextLine();
                    System.out.println("Enter Admin password: ");
                    String password=scannerStr.nextLine();
                    System.out.println(adminService.addAdmin(username,password));
                }
                case 2->{
                    System.out.println("Enter Student User name: ");
                    String username=scannerStr.nextLine();
                    System.out.println("Enter Student password: ");
                    String password=scannerStr.nextLine();
                    System.out.println("Enter Student Full name: ");
                    String fullname=scannerStr.nextLine();
                    System.out.println("Enter Student's course name: ");
                    String coursename=scannerStr.nextLine();
                    System.out.println("Enter Student's course number: ");
                    String coursenumber=scannerStr.nextLine();
                    System.out.println("Enter Student's group number: ");
                    String groupnumber=scannerStr.nextLine();
                    System.out.println(studentService.addStudent(username,password,fullname,coursename,coursenumber,groupnumber));
                }
                case 3->{
                    System.out.println("Enter User name: ");
                    String username=scannerStr.nextLine();
                    System.out.println("Enter password: ");
                    String password=scannerStr.nextLine();
                    if(adminService.login(username,password)!=null){
                        int stepCode2=100;
                        while (stepCode2!=0) {
                            System.out.println("1.Add Branch, 2.View Branch list, 3.Add Course, 4.View Course list, 5.Add Teacher, 6.View Teacher list, 7.View Student List, 8.View Admin List, 0.Exit");
                            stepCode2 = scannerInt.nextInt();
                            switch (stepCode2){
                                case 1->{
                                    System.out.println("Enter Branch name: ");
                                    String branchname=scannerStr.nextLine();
                                    System.out.println("Enter Branch location: ");
                                    String location=scannerStr.nextLine();
                                    System.out.println(branchService.addBranch(branchname,location));
                                }
                                case 2->{
                                    branchService.getBranchList();
                                }
                                case 3->{
                                    System.out.println("Enter Course name: ");
                                    String coursename=scannerStr.nextLine();
                                    System.out.println("Enter Course number: ");
                                    String coursenumber=scannerStr.nextLine();
                                    System.out.println("Enter Course price: ");
                                    double courseprice=scannerInt.nextDouble();
                                    System.out.println("Enter Group number: ");
                                    String groupnumber=scannerStr.nextLine();
                                    System.out.println("Enter Group capacity: ");
                                    int groupcapacity=scannerInt.nextInt();
                                    System.out.println(courseService.addCourse(coursename,coursenumber,courseprice,groupnumber,groupcapacity));
                                }
                                case 4->{
                                    courseService.getCourseList();
                                }
                                case 5->{
                                    System.out.println("Enter Teacher User name: ");
                                    String teacherusername=scannerStr.nextLine();
                                    System.out.println("Enter Teacher password: ");
                                    String teacherpassword=scannerStr.nextLine();
                                    System.out.println("Enter Teacher Full name: ");
                                    String teacherfullname=scannerStr.nextLine();
                                    System.out.println("Enter Teacher's specialization: ");
                                    String teacherspecializationname=scannerStr.nextLine();
                                    System.out.println("Enter Teacher's level: ");
                                    String teacherlevel=scannerStr.nextLine();
                                    System.out.println(teacherService.addTeacher(teacherusername,teacherpassword,teacherfullname,teacherspecializationname,teacherlevel));
                                }
                                case 6->{
                                    teacherService.getTeacherList();
                                }
                                case 7->{
                                    studentService.getStudentList();
                                }
                                case 8->{
                                    adminService.getAdminList();
                                }
                            }
                        }
                    }
                    else {
                        if(teacherService.login(username,password)!=null){
                            int stepcode3=100;
                            while(stepcode3!=0) {
                                System.out.println("1.View Branch list, 2.View Course list, 3.View Teacher list, 4.My groups, 5.My profile 0.Exit");
                                stepcode3=scannerInt.nextInt();
                                switch (stepcode3) {
                                    case 1 -> {
                                        branchService.getBranchList();
                                    }
                                    case 2 -> {
                                        courseService.getCourseList();
                                    }
                                    case 3 -> {
                                        teacherService.getTeacherList();
                                    }
                                    case 4 -> {

                                    }
                                    case 5 -> {
                                        teacherService.getTeacher(username,password);
                                    }
                                }
                            }
                        }
                        else{
                            if(studentService.login(username,password)!=null){
                                int stepcode4=100;
                                while(stepcode4!=0){
                                    System.out.println("1.View Branch list, 2.View Course list, 3.View Teacher list, 4.My courses, 5.My profile, 0.Exit");
                                    stepcode4=scannerInt.nextInt();
                                    switch (stepcode4){
                                        case 1->{
                                            branchService.getBranchList();
                                        }
                                        case 2->{
                                            courseService.getCourseList();
                                        }
                                        case 3->{
                                            teacherService.getTeacherList();
                                        }
                                        case 4->{

                                        }
                                        case 5->{
                                            studentService.getStudent(username,password);
                                        }
                                    }
                                }
                            }
                            else {
                                System.out.println("User name or password incorrect.Please try again!");
                            }
                        }
                    }
                }
            }
        }
    }
}