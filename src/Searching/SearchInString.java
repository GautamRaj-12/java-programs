package Searching;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter the character you want to search for in the string: ");
        char ch = sc.next().charAt(0);

        searchInString(str,ch);
    }
    static void searchInString(String str, char ch){
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                System.out.println("The character is found at index: "+i);
                break;
            }
        }
        if(i==str.length()){
            System.out.println("The character is not present in the string");
        }
    }
}
