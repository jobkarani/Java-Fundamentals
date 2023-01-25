package arrays;
public class Main{
    public static void main(String [] args){
        float [] theVals = {10.0f, 15.0f, 20.0f};
        float sum = 0.0f;
        for ( int index = 0; index<theVals.length; index++){
            sum += theVals[index]; 
            System.out.println(sum);
        }
    }
}