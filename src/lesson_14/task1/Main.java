package lesson_14.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student(1,"Иван", "Иванов", 1);
        Student student2 = new Student(2,"Петр", "Петров", 2);
        Student student3 = new Student(3,"Василий", "Васильевич", 3);
        Student student4 = new Student(4,"Марк", "Марков", 1);
        Student student5 = new Student(5,"Сидор", "Сидоров", 2);
        Student student6 = new Student(6,"Михаил", "Михайлович", 3);
        Student student7 = new Student(7,"Матвей", "Матвеевич", 1);
        Student student8 = new Student(8,"Матвей", "Матвеевич", 2);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);

        Student.print(Student.studentsByCourse(students));

    }
}
