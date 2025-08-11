public class Course {

    static int maxCapacity = 100;
    
    String courseName;
    int enrollments;
    
    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }


    void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenroolStudent(String studentName){
        System.out.println("student removed");
        enrollments--;
    }
    static void setMaxCapacity (int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
}
