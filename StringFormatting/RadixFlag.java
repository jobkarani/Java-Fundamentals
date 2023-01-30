package StringFormatting;
public class RadixFlag{
    public static void main(String [] args){
        int ival = 32;

        String s1 = String.format("%d", ival); //32 value of ival
        String s2 = String.format("%x", ival); //20 hexadecimal of ival(32)
        String s3 = String.format("%#x", ival); //0x20 uses radix ***#*** Using lowercase x
        String s4 = String.format("%#X", ival); //0X20 uses radix ***#*** Using uppercase X
    }
}