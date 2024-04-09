package lesson_20.task1;

public class FilterByCourse implements IFilter {
    @Override
    public boolean test(Student student) {
        return student.getCourse()==2;
    }
}
