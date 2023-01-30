// exiting a method using RETURN

package methods;
public class Exiting{
    public static void main(String [] args){
        showSum(100.0f, 20.3f, 0);
        
        System.out.println("Back from showSum!!");
    }

    static void showSum(float x, float y, int count){
        if(count < 1){
            return;
        }
        else{
            float sum = x + y;

            for(int i = 0; i < count; i++){
                System.out.println(sum);
            }
            return;
        }
    } 
}