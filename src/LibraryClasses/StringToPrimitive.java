package LibraryClasses;

public class StringToPrimitive {
    public static void main(String[] args) {
        //String to integer
        String age = "24";
        int ageConverted = Integer.parseInt(age);
        System.out.println(ageConverted); //Output: 24
        System.out.println(ageConverted+2); //Output:26

        //String to double
        String percentage = "55.60";
        double percentageConverted = Double.parseDouble(percentage);
        System.out.println(percentageConverted); //Output: 55.6
        System.out.println(percentageConverted+2); //Output: 57.6

        //String to long
        String population = "19202038293293";
        long populationConverted = Long.parseLong(population);
        System.out.println(populationConverted); //Output: 19202038293293
        System.out.println(populationConverted+2); //Output:19202038293295

        //using valueOf()
        int ageConverted2 = Integer.valueOf(age);
        System.out.println(ageConverted2+3); //Output:27
        double percentageConverted2 = Double.valueOf(percentage);
        System.out.println(percentageConverted2+3); //Output:58.6
        long populationConverted2 = Long.valueOf(population);
        System.out.println(populationConverted2+3); //Output:19202038293296
    }
}
