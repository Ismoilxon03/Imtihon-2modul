package service;

import model.Course;

public class CourseService {
    Course[] courseList=new Course[100];
    int index=0;
    public boolean addCourse(String coursename, String coursenumber, double price, String groupnumber, int groupcapacity){
        for (Course course : courseList) {
            if(course!=null){
                if(course.getCoursename().equals(coursename) && course.getCourseNumber().equals(coursenumber) && course.getGroupNumber().equals(groupnumber)){
                    return false;
                }
            }
        }
        courseList[index++]=new Course(coursename,coursenumber,price,groupnumber,groupcapacity);
        return true;
    }
    public void getCourseList(){
        int cnt=0;
        for (Course course : courseList) {
            if(course!=null){
                System.out.println("\t<<"+ ++cnt +">>\t");
                System.out.println("Kurs nomi: "+course.getCoursename());
                System.out.println("Kurs raqami: "+course.getCourseNumber());
                System.out.println("Kursning guruh raqami: "+course.getGroupNumber());
                System.out.println("Kursning narxi: "+course.getCoursePrice());
                System.out.println("Kursning qabul qiladigan o'quvchilar soni: "+course.getGroupcapacity());
            }
        }
    }
}
