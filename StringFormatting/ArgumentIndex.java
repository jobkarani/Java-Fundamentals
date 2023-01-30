package StringFormatting;
public class ArgumentIndex{
    public static void main(String [] args){
        int valA = 100, valB = 200, valC = 300;

        String s1 = String.format("%d %d %d", valA, valB, valC); // 100 200 300

        // using the index $ argument 
        String s2 = String.format("%3$d %1$d %2$d", valA, valB, valC); // 300 100 200

        // using both $ and < arguments
        String s3 = String.format("%2$d %<d %1$d", valA, valB, valC); // 200 200 100
    }
}