package lesson_19.task4;

import java.util.ArrayList;
import java.util.List;

//        Написать ещё три фильтра для студентов по разным полям.
//        В одном фильтре использовать <(больше) или >(меньше), во втором равенство, в третьем equals.
//        Использовать и обычный, и анонимный классы.

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "Ivanov", 20, 3.5, 1));
        studentList.add(new Student("Oleg", "Ivanov", 20, 3.5, 1));
        studentList.add(new Student("Petr", "Ptrov", 25, 4.5, 2));
        studentList.add(new Student("Max", "Maximov", 24, 5, 3));
        studentList.add(new Student("Sidor", "Sidorov", 21, 4, 5));
        studentList.add(new Student("Mark", "Markov", 26, 5, 2));
        studentList.add(new Student("Vasiliy", "Vasilyev", 23, 3.8, 2));

        System.out.println("\nФильтр по возрасту: ");
        StudentUtils.filterByAge(studentList, new Filter());

        System.out.println("\nФильтр по курсу: ");
        StudentUtils.filterByCourse(studentList, new FilterByCourse());

        System.out.println("\nФильтр по фамилии студента: ");
        Student studentForFound = new Student("Ivan", "Ivanov", 20, 3.5, 1);
        StudentUtils.filterBySurname(studentList, new FilterByStudent());

        System.out.println("\nФильтр по среднему баллу (отличники): ");
        StudentUtils.filterByAveregeRate(studentList, new IFilter() {
            @Override
            public boolean test(Student student) {
                return student.getAveregeRate()>4.9;
            }
        });
    }



}
