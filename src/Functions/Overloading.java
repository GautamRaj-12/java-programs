package Functions;

public class Overloading {
    public static void main(String[] args) {
        fun(4,5);
        fun(4,5,6);
        fun("Raj");
    }
    static void fun(int a,int b){
        System.out.println("Sum of 2 numbers: "+(a+b));
    }
    static void fun(int a,int b,int c){
        System.out.println("Sum of 3 numbers: "+(a+b+c));
    }
    static void fun(String name){
        System.out.println("Name: "+name);
    }
}
