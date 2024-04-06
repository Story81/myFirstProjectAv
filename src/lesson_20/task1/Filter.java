package lesson_20.task1;

public class Filter implements IFilter {
    @Override
    public boolean test(Student student) {
        return student.getAge()>21;
    }

}
