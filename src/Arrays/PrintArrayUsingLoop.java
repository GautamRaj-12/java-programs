package Arrays;

public class PrintArrayUsingLoop {
    public static void main(String[] args) {
        int[] marks = {55,65,76,67,89,45,34,56,87};

        //using .length property to find the length of the array.
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
