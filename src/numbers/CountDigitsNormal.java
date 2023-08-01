package numbers;

public class CountDigitsNormal {
    public static void main(String[] args) {
        int noOfDigits=countDigits(28735);
        System.out.println(noOfDigits);
    }
    static int countDigits(int n){
        int rem,count=0;
        while(n!=0){
            count++;
            n = n/10;
        }
        return count;
    }
}
