package lesson_1;

public class Case {
    public static void main(String[] args) {
        C c = new C();
    }
    static class A {
       static {
           System.out.print("1");
       }
       A(){
           System.out.print("2");
       }
       A (String str){
           this();
           System.out.print("3");
       }
    }
    static class B extends A{
        static {
            System.out.print("4");
        }
        B(){
            super();
            System.out.print("5");
        }
        B(String str){
            this();
            System.out.print("6");
        }
    }

    static  class  C extends B {
        static {
            System.out.print("7");
        }
        C(){
            super(("hello"));
            System.out.print("9");
        }
        {
            System.out.print("8");
        }
    }
}
