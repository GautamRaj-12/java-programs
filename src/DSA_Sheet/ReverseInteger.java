package DSA_Sheet;
/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).*/
public class ReverseInteger {
    public static void main(String[] args) {
        int res = reverse(1534236469);
        System.out.println(res);
    }
    static int reverse(int n){
        int rem,rev=0;
        while(n!=0){
            rem = n%10;
            if((rev>Integer.MAX_VALUE/10)||(rev<Integer.MIN_VALUE/10)){
                return 0;
            }
            rev = rev*10+rem;
            n = n/10;
        }
        return rev;
    }
}
