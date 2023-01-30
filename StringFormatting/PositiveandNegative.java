package StringFormatting;
public class PositiveandNegative{
    public static void main(String [] args){
        int iPosVal = 123,  iNegVal = -456;

        String s1 = String.format("%d", iPosVal); // 123
        String s2 = String.format("%d", iNegVal); // -456

        // using the space flag 
        String s3 = String.format("% d", iPosVal); //  123
        String s4 = String.format("% d", iNegVal); // -456

        // using the + flag 
        String s5 = String.format("%+d", iPosVal); // +123
        String s6 = String.format("%+d", iNegVal); // -456

        // using the ( flag (counting notation) 
        String s7 = String.format("%(d", iPosVal); 
        String s8 = String.format("%(d", iNegVal); 
        System.out.println(s7); // 123
        System.out.println(s8); // (456)

        // combined space and ( flag for proper alignment of positive and negative values
        String s10 = String.format("% (d", iPosVal); 
        String s11 = String.format("% (d", iNegVal); 
        System.out.println(s10); //  123
        System.out.println(s11); // (456)
    }
}