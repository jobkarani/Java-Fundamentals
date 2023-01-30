package StringFormatting;
public class ConcatvsFormat{
    public static void main(String [] args){
        int david = 17, john = 15, mary  = 8, mercy = 6 ;

        String s1 = "My nephews are " + david + ", " + john + ", " + mary + " and " + mercy + " years old."; // string concatenation
        System.out.println(s1);

        String s2 = String.format("My nephews are %d, %d, %d and %d years old. ", david, john, mary, mercy); // string formatting
        System.out.println(s2);

        double avgDiff = ((david - john)+(john - mary)+(mary - mercy)) / 3.0d;
        String s3 = "The average age between each is " + avgDiff + " years."; //string concat
        System.out.println(s3);

        String s4 = String.format("The average age between each is %.1f years.", avgDiff); // sting formatted to 1 decimal place
        System.out.println(s4);
    }
}