package lesson_8;

public class Rectangle extends Square {
  private int side2;


    public Rectangle(String figureName, int side1, int side2) {
        super(figureName, side1);
        this.side2 = side2;
    }

    @Override
    public void perimeter() {
        perimeter = (getSide1()+side2)*2;
        System.out.println("Периметр фигуры (" + figureName + ") равен " + perimeter);
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        return side2 == rectangle.side2;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + side2;
        return result;
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами: " +
                "а = "+getSide1()+
                ", b = " + side2
                ;
    }
}
