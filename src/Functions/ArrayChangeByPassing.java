package Functions;
import java.util.Arrays;

public class ArrayChangeByPassing {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        System.out.println("Array before change: "+Arrays.toString(arr));
        change(arr);
        System.out.println("Array after change inside main function: "+Arrays.toString(arr));
    }
    static void change(int []changeArr){
        changeArr[0] = 15;
    }
}
