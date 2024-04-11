package lesson_21.task2;

import lesson_20.task1.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "Ivanov", 20, 3.5, 1));
        studentList.add(new Student("Oleg", "Ivanov", 21, 3.5, 2));
        studentList.add(new Student("Pavel", "Ivanov", 25, 4.5, 5));
        studentList.add(new Student("Petr", "Ptrov", 25, 4.5, 2));
        studentList.add(new Student("Max", "Maximov", 25, 5, 3));
        studentList.add(new Student("Sidor", "Sidorov", 22, 4, 5));
        studentList.add(new Student("Mark", "Markov", 25, 5, 1));
        studentList.add(new Student("Markovka", "Markov", 31, 5, 1));
        studentList.add(new Student("Vasiliy", "Vasilyev", 23, 3.8, 2));

        //1. отсортировать студентов по возрасту и по имени(по возрастанию и по алфавиту) и сохранить в лист

        var list2 = studentList.stream().sorted((x1, x2) -> x1.getName().compareTo(x2.getName())).sorted((x1, x2) -> Integer.compare(x1.getAge(), x2.getAge())).toList();
        list2.forEach(System.out::println);
        System.out.println();

        //2. отобрать студентов по условию(к примеру возраст более 30) и сохранить в мапу с ключем имя студента
        var list = studentList.stream().filter(x -> x.getAge() > 30).collect(Collectors.toMap(key -> key.getName(), value -> value));
        System.out.println(list);


        //3. найти второго по возрастанию возраста студента
        System.out.println();
        var s = studentList.stream().sorted((x1, x2) -> Integer.compare(x1.getAge(), x2.getAge())).toList().get(1);
        System.out.println("Второй по возрасту" + s);

        //4. посчитать средний бал все студентов(с помощью метода reduce - ознакомиться самостоятельно)
        System.out.println();
        var avRateAllStudents = studentList.stream().mapToDouble(Student::getAveregeRate).average().getAsDouble();
        System.out.printf("Средний бал всех студентов- %.2f ", avRateAllStudents);
    }
}
