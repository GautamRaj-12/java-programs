package Functions;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        fun1(2,3,4,5,6,7,8,9);
        mix(3,4,"ferrari","red bull","alpine");
    }
    static void fun1(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void mix(int a, int b, String ...s){
        System.out.println(a+" "+b);
        System.out.println(Arrays.toString(s));
    }
}
