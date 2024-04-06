package lesson_19.task4;

public class FilterByStudent implements  IFilter{

//Фильтр по фамилии. Студенты идентичны, если равны только фамилии. equals и hashcod переопределены на сравнение только по фамилии

    public boolean test(Student student) {
        Student studentForFound = new Student("Ivan", "Ivanov", 20, 3.5, 1);
        return student.equals(studentForFound);


    }
}
