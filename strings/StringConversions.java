package strings;
public class StringConversions{
    public static void main(String [] args){
        
        int iVal = 100;
        String sVal = String.valueOf(iVal); 
        System.out.println(sVal);   //"100"

        // implicit conversion
        int i = 2;
        int j = 3;
        int result = i * j;
        String output = i + " * " + j + " = " + result; 
        System.out.println(output);  // "2 * 3 = 6"
    }
    
}