package lesson_19.task4;

import java.util.List;

public class StudentUtils {
    public  static  void filterByAge(List<Student> list, IFilter filter){
        for (Student student : list) {
            if (filter.test(student)) {
                System.out.println(student);
            }
        }
    }

    public  static  void filterByCourse(List<Student> list, IFilter filter){
        for (Student student : list) {
            if (filter.test(student)) {
                System.out.println(student);
            }
        }
    }
    public  static  void filterBySurname(List<Student> list, IFilter filter){
        for (Student student : list) {
            if (filter.test(student)) {
                System.out.println(student);
            }
        }
    }

    public  static  void filterByAveregeRate(List<Student> list, IFilter filter){
        for (Student student : list) {
            if (filter.test(student)) {
                System.out.println(student);
            }
        }
    }


}
