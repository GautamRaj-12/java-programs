package Arrays;

public class FirstArray {
    public static void main(String[] args) {

        //declaration
        int[] marks;

        //allocating memory
        marks = new int[10];

        //Initializing one by one
        marks[0]=25;
        marks[1]=71;
        marks[2]=55;
        marks[3]=70;
        marks[4]=68;
        marks[5]=36;
        marks[6]=99;
        marks[7]=48;
        marks[8]=38;
        marks[9]=43;

        /*
            or alternatively: We can declare, allocate memory(automatic) and initialize array in single line like this:
        */
        // int[] marks = {25,71,55,70,68,36,99,48,38,43};

        //Accessing and printing values one by one
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        System.out.println(marks[7]);
        System.out.println(marks[8]);
        System.out.println(marks[9]);
    }
}
