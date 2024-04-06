package lesson_20.task1;

import java.util.List;
import java.util.function.Predicate;

public class StudentUtils {
    public  static  void filter(List<Student> list, Predicate<Student> filter){
        for (Student student : list) {
            if (filter.test(student)) {
                System.out.println(student);
            }
        }
    }
}
