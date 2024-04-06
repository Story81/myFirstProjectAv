package lesson_20.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

//        Написать ещё три фильтра для студентов по разным полям.
//        В одном фильтре использовать <(больше) или >(меньше), во втором равенство, в третьем equals.
//        Использовать и обычный, и анонимный классы.

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "Ivanov", 20, 3.5, 1));
        studentList.add(new Student("Oleg", "Ivanov", 22, 3.5, 2));
        studentList.add(new Student("Pavel", "Ivanov", 25, 4.5, 5));
        studentList.add(new Student("Petr", "Ptrov", 25, 4.5, 2));
        studentList.add(new Student("Max", "Maximov", 24, 5, 3));
        studentList.add(new Student("Sidor", "Sidorov", 21, 4, 5));
        studentList.add(new Student("Mark", "Markov", 26, 5, 1));
        studentList.add(new Student("Markovka", "Markov", 21, 5, 1));
        studentList.add(new Student("Vasiliy", "Vasilyev", 23, 3.8, 2));

        System.out.println("\nФильтр по возрасту: ");
        StudentUtils.filter(studentList, x -> x.getAge() < 24);

        System.out.println("\nФильтр по курсу: ");
        StudentUtils.filter(studentList, x -> x.getCourse()==2);

        System.out.println("\nФильтр по студенту: ");
        Student studentForFound = new Student("Markovka", "Markov", 21, 5, 1);
        StudentUtils.filter(studentList, x -> x.equals(studentForFound));

        System.out.println("\nФильтр по среднему баллу (отличники): ");
        StudentUtils.filter(studentList, x -> x.getAveregeRate() > 4.9);

        Predicate<Student> predicate = x -> x.getAveregeRate()==5&&x.getCourse()==1;
        System.out.println("\nФильтр все отличники на курсе 1: ");
        StudentUtils.filter(studentList, predicate);

        Predicate<Student> predicate1 = x -> Objects.equals(x.getSurname(), "Ivanov") &&x.getAge()>21;
        System.out.println("\nФильтр: все студенты по фамилии Ivanov старше 21: ");
        StudentUtils.filter(studentList, predicate1);

        System.out.println("\nФильтр: отличники на курсе 1 старше 21  ");
        StudentUtils.filter(studentList, predicate.and(x -> x.getAge() > 21));
    }
}
