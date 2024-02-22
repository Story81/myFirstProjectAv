package lesson_8;

import java.util.Scanner;

public class Rectangle  extends Figure{


@Override
    public  void perimeter(){
        perimeter = side1 + side2 + side3;
        System.out.println("Периметр фигуры ("+ figureName+ ") равен " +perimeter);
    }


    public Rectangle(String figureName, int side1, int side2, int side3) {
        this.figureName = figureName;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

}
