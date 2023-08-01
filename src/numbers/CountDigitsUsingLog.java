package numbers;

public class CountDigitsUsingLog {
    public static void main(String[] args) {
        System.out.println(countDigits(23567));
    }
    static int countDigits(int n){
        return (int)(Math.log10(n)+1);
    }
}
