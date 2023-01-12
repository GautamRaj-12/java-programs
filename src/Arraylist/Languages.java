package Arraylist;

import java.util.ArrayList;

public class Languages {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        //Adding elements
        languages.add("C");
        languages.add("C++");
        languages.add("Java");
        languages.add("Python");
        languages.add("Javascript");
        System.out.println("Languages known: "+languages);

        //Accessing Element
        String elementAtIndex = languages.get(2);
        System.out.println("Language at index 2: "+elementAtIndex);

        //Changing Element
        languages.set(3,"css");
        System.out.println("Languages known updated: "+languages);

        //Removing Element
        languages.remove(4);
        System.out.println("Languages after removal: "+languages);
    }
}
