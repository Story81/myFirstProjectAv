package lesson_8;

import java.util.Objects;

public class Square extends Figure{
   private int side1;

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    @Override
    public  void perimeter(){
        perimeter = side1*4;
        System.out.println("Периметр фигуры ("+ figureName+ ") равен " +perimeter);
    }

    public Square(String figureName, int side1) {
        this.figureName = figureName;
        this.side1 = side1;
          }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return side1 == square.side1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1);
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " +
                "а = " + side1;
    }
}
