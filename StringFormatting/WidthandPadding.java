package StringFormatting;
public class WidthandPadding{
    public static void main(String [] args){
        int w = 5, x = 235, y = 481, z = 12;

        String s1 = String.format("W:%d X:%d", w, x); // W:5, X:235
        String s2 = String.format("Y:%d Z:%d", y, z); // Y:481, Z:12

        // using a width of 4 (%4d)
        String s3 = String.format("W:%4d X:%4d", w, x); // W:   5, X: 235 
        String s4 = String.format("Y:%4d Z:%4d", y, z); // Y: 481, Z:  12 

        // using the 0 flag (padding) and width of 4 (%04d)
        String s5 = String.format("W:%04d X:%04d", w, x); // W:0005, X:0235 
        String s6 = String.format("Y:%04d Z:%04d", y, z); // Y:0481, Z:0012 

        // using the - flag (left justify) and width of 4 (%-4d) 
        String s7 = String.format("W:%-4d X:%-4d", w, x); // W:5   , X:235  
        String s8 = String.format("Y:%-4d Z:%-4d", y, z); // Y:481 , Z:12   
    }
}