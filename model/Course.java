package model;

public class Course {
    private String coursename;
    private String courseNumber;
    private double coursePrice;
    private String groupNumber;
    private int groupcapacity;

    public Course() {
    }

    public Course(String coursename, String coursenumber, double price, String groupnumber, int groupcapacity) {
        this.coursename = coursename;
        this.courseNumber = coursenumber;
        this.coursePrice = price;
        this.groupNumber = groupnumber;
        this.groupcapacity = groupcapacity;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getGroupcapacity() {
        return groupcapacity;
    }

    public void setGroupcapacity(int groupcapacity) {
        this.groupcapacity = groupcapacity;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    @Override
    public String toString() {
        return "Course{" +
                "coursename='" + coursename + '\'' +
                ", courseNumber='" + courseNumber + '\'' +
                ", coursePrice=" + coursePrice +
                ", groupNumber='" + groupNumber + '\'' +
                ", groupcapacity=" + groupcapacity +
                '}';
    }
}
