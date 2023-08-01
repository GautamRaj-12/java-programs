package numbers;

public class CountDigitsUsingString {
    public static void main(String[] args) {
        System.out.println(countDigits(2378));;
    }
    static int countDigits(int n){
        return (Integer.toString(n)).length();
    }
}
