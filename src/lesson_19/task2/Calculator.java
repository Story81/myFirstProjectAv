package lesson_19.task2;

public class Calculator {
    private int a;
    private int b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //локально вложенный класс

    public  void  sum(){
        //класс досутпен только внутри метода
        class Sum{
            private int innerA;
            private int innerB;
            private  void  printSum(){
                System.out.println("Сумма чисел равна " + (innerA+innerB));
                }

            public Sum(int innerA, int innerB) {
                this.innerA = innerA;
                this.innerB = innerB;
            }
        }
        Sum sum = new Sum(a,b);
        sum.printSum();
    }

}


