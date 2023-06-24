package LibraryClasses;

public class PrimitiveToString {
    public static void main(String[] args) {
        //Integer to string
        int age = 24;
        String ageConverted = Integer.toString(age);
        System.out.println(ageConverted); //Output: "24"
        System.out.println(ageConverted+2); //Output: 242

        //Double to String
        double percentage = 55.60;
        String percentageConverted = Double.toString(percentage);
        System.out.println(percentageConverted); //Output: "55.6"
        System.out.println(percentageConverted+2); //Output: 55.62

        //Long to String
        long population = 1920203826756567876l;
        String populationConverted = Long.toString(population);
        System.out.println(populationConverted); //Output: "1920203826756567876"
        System.out.println(populationConverted+2); //Output: "19202038267565678762"
    }
}
