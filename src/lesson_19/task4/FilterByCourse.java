package lesson_19.task4;

public class FilterByCourse implements  IFilter{
    @Override
    public boolean test(Student student) {
        return student.getCourse()==2;
    }
}
