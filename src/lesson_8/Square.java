package lesson_8;

public class Square extends Figure{
    @Override
    public  void perimeter(){
        perimeter = side1*4;
        System.out.println("Периметр фигуры ("+ figureName+ ") равен " +perimeter);
    }

    public Square(String figureName, int side1) {
        this.figureName = figureName;
        this.side1 = side1;
          }
}
