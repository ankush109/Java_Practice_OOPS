import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Compare based on GPA in descending order
        return student1.getAge() - student2.getAge();
    }
}

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // Getters and setters (omitted for brevity)
}

public class Comp {
    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20, 3.7));
        students.add(new Student("Alice", 21, 3.9));
        students.add(new Student("Bob", 19, 3.5));

        // Sort students based on GPA using the custom comparator
        Collections.sort(students, new StudentGPAComparator());

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student.getName() + ", GPA: " + student.getAge());
        }
    }
}