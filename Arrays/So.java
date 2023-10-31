import java.util.*;

class Student {
    int marks;
    int roll;

    Student(int marks, int roll) {
        this.marks = marks;
        this.roll = roll;
    }

}

class StudentMarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks - o2.marks;
    }
}

public class So {
    public static void main(String[] args) {
        Student a = new Student(80, 1);
        Student b = new Student(70, 2);
        Student c = new Student(60, 4);
        Student d = new Student(20, 5);
        List<Student> s = new ArrayList<>();
        s.add(a);
        s.add(b);
        s.add(c);
        s.add(d);
        StudentMarksComparator comp = new StudentMarksComparator();
        Collections.sort(s, comp);
        for (Student student : s) {
            System.out.println("Roll: " + student.roll + ", Marks: " + student.marks);
        }
    }
}
