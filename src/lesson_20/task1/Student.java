package lesson_20.task1;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double averegeRate;
    private int course;

    public Student(String name, String surname, int age, double averegeRate, int course) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averegeRate = averegeRate;
        this.course = course;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAveregeRate() {
        return averegeRate;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return " студент (" +
                "имя= '" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                ", возраст =" + age +
                ", ср.оценка =" + averegeRate +
                ", курс =" + course +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (Double.compare(student.averegeRate, averegeRate) != 0) return false;
        if (course != student.course) return false;
        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        temp = Double.doubleToLongBits(averegeRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + course;
        return result;
    }
}
