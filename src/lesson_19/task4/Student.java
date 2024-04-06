package lesson_19.task4;

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
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averegeRate=" + averegeRate +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return surname != null ? surname.hashCode() : 0;
    }
}
