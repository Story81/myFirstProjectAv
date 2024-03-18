package lesson_14.task1;

import java.util.*;

public class Student {

    private String name;
    private int id;
    private String getName;
    private String surname;
    private int course;


//    Написать метод, который группирует студентов по курсам.
//    То есть метод должен возвращать мапу, у которой ключ - номер курса, а значение - список студентов на этом курсе.




    public  static  Map<Integer,ArrayList<Student>> studentsByCourse (List <Student> students){
         Map<Integer, ArrayList<Student>> studentsOnCoursesMap = new HashMap<>();

        for (Student student : students){
          int course = student.getCourse();
            if (studentsOnCoursesMap.containsKey(course)){
                ArrayList<Student> studentsList = studentsOnCoursesMap.get(course);
                studentsList.add(student);
            }else{
                ArrayList<Student> studentList = new ArrayList<>();
                studentList.add(student);
                studentsOnCoursesMap.put(course, studentList);
            }
        }
        return studentsOnCoursesMap;
    }


    public static void print(Map<Integer,ArrayList<Student>> studentsOnCoursesMap) {
        System.out.println("Список студентов: " );
        for (Map.Entry<Integer, ArrayList<Student>> entry : studentsOnCoursesMap.entrySet()) {
            System.out.println("На курсе "+entry.getKey()+ " учатся студенты "+entry.getValue());
        }
    }

    public Student( int id, String name, String surname, int course) {
        this.name = name;
        this.id = id;
        this.surname = surname;
        this.course = course;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGetName() {
        return getName;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return String.format("Студент: id %d, %s %s, курс %d", id, name, surname, course);
    }
}
