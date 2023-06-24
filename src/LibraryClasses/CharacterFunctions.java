package LibraryClasses;

public class CharacterFunctions {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'c';
        char ch3 = '5';
        char ch4 = ' ';

        /*
        We can create variables for values returned by the functions, like this:
            boolean result1 = Character.isDigit(ch1);
            System.out.println(result1); //false
            boolean result2 = Character.isDigit(ch3);
            System.out.println(result2); //false
        */
        /*Or we can also directly use the functions in println function.
        In That way there is no need to create other variables*/
        System.out.println(Character.isDigit(ch1)); //false
        System.out.println(Character.isDigit(ch3)); //true
        System.out.println();

        System.out.println(Character.isLetter(ch2)); //true
        System.out.println(Character.isLetter(ch3)); //false
        System.out.println();

        System.out.println(Character.isLetterOrDigit(ch1)); //true
        System.out.println(Character.isLetterOrDigit(ch3)); //true
        System.out.println(Character.isLetterOrDigit(ch4)); //false
        System.out.println(Character.isLetterOrDigit('@')); //false
        System.out.println();

        System.out.println(Character.isWhitespace(ch1));    //false
        System.out.println(Character.isWhitespace(ch4));    //true
        System.out.println();

        System.out.println(Character.isLowerCase(ch1)); //false
        System.out.println(Character.isLowerCase(ch2)); //true
        System.out.println();

        System.out.println(Character.isUpperCase(ch1)); //true
        System.out.println(Character.isUpperCase(ch2)); //false
        System.out.println();

        System.out.println(Character.toLowerCase(ch1)); //a
        System.out.println();

        System.out.println(Character.toUpperCase(ch2)); //C
        System.out.println();
    }
}
