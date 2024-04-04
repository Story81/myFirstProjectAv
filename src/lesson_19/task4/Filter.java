package lesson_19.task4;

public class Filter implements IFilter{
    @Override
    public boolean test(Student student) {
        return student.getAge()>21;
    }

}
