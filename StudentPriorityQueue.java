//

import java.util.*;
import java.util.List;

public class StudentPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<)

        @Override
        public int compare(Student student, Student t1) {
            return student.getGrade() - t1.getGrade();
        }
    });

    queue.offer(new Student("siddhi","B"));
    queue.offer(new Student("shyam","C"));
    queue.offer(new Student("Ram","A"));
    queue.offer(new Student("Mohan","D"));
    queue.offer(new Student("sanchit","A"));
    
    System.out.printf("Queue is: %s" , queue);

}

    
    private static class Student {

        private final String name;
        private final char grade;

        public Student(String name, char grade){
            this.name = name;
            this.grade = grade;
        }

        public String getName(){
            return name;
        }

        public char getGrade() {
            return grade;
        }


        @Override
        public String toString(){
            return name + ": " + grade;
        }

    }
}
