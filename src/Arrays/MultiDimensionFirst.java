package Arrays;

public class MultiDimensionFirst {
    public static void main(String[] args) {
        /*
            Declaration and Memory Allocation
             //int[][] arr = new int[3][4];
        */

        //Declaration + Memory Allocation + Initialization
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        // or

        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //each row of the multidimensional array in Java can be of different lengths
        int[][] arr3 = {
                {1,2,3,4},
                {5,6,7},
                {8,9}
        };

    }
}
