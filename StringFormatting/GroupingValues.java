package StringFormatting;
public class GroupingValues{
    public static void main(String [] args){
        int iVal = 1234567;

        String s1 = String.format("%d", iVal); //1234567

        // using the comma flag (,)
        String s2 = String.format("%,d", iVal); // 1,234,567 

        double dVal = 1234567.0d;

        String s3 = String.format("%,.2f",dVal); // 1,234,567.00
    }
}